package irvine.oeis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

/**
 * Plot some pictures associated with A363381.
 * @author Thomas Young
 * @author Sean A. Irvine
 */
public final class PlotA363381 {

  private PlotA363381() {
  }

  private static final int OPACITY = 66;
  private static final Color[] COLORS = {
    new Color(0, 255, 0, OPACITY),     // Green
    new Color(0, 0, 255, OPACITY),     // Blue
    new Color(255, 0, 255, OPACITY),   // Pink
    new Color(255, 255, 0, OPACITY),   // Yellow
    new Color(255, 0, 0, OPACITY),     // Red
    new Color(0, 255, 255, OPACITY),   // Cyan
    new Color(255, 255, 255, OPACITY), // White
    new Color(112, 112, 112, OPACITY), // Grey
  };
  private static final int SIZE = 8;
  private static final int SCALE = 80;

  private static void renderImage(final Graphics g, final ArrayList<Integer> square) {
    for (int i = 0; i < SIZE * SIZE; ++i) {
      g.setColor(COLORS[i / SIZE]);
      final int c = square.get(i);
      final int x = SCALE * ((c % SIZE) + 1);
      final int y = SCALE * ((c / SIZE) + 1);
      g.fillRect(x, y, SCALE, SCALE);
      g.setColor(Color.BLACK);
      for (int r = 0; r <= SIZE; ++r) {
        g.drawLine(SCALE * (r + 1), SCALE, SCALE * (r + 1), SCALE * (SIZE + 1));
        g.drawLine(SCALE, SCALE * (r + 1), SCALE * (SIZE + 1), SCALE * (r + 1));
      }
    }
  }

  private static void draw(final String outputType, final File outDir, final ArrayList<Integer> square, final int suffix) throws IOException {
    final BufferedImage image = new BufferedImage(SCALE * (SIZE + 2), SCALE * (SIZE + 2), BufferedImage.TYPE_INT_RGB);
    final Graphics2D g = image.createGraphics();
    try {
      g.setColor(Color.WHITE);
      g.fillRect(0, 0, image.getWidth(), image.getHeight());
      renderImage(g, square);
      //final String timestamp = ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT);
      //final File file = new File(outDir, "squares-" + suffix + "-" + timestamp + "." + outputType);
      final File file = new File(outDir, "squares-" + suffix + "." + outputType);
      final ImageWriter writer = ImageIO.getImageWritersByFormatName(outputType).next();
      final ImageWriteParam params = writer.getDefaultWriteParam();
      // Enable compression and set quality (0.0 = lowest, 1.0 = highest)
      params.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
      params.setCompressionQuality(0.3f); // adjust this value between 0.3f–0.8f to balance quality/size
      try (final ImageOutputStream outputStream = ImageIO.createImageOutputStream(file)) {
        writer.setOutput(outputStream);
        writer.write(null, new javax.imageio.IIOImage(image, null, null), params);
      }
      writer.dispose();
    } finally {
      g.dispose();
    }
  }

  private static void tikzHeader(final PrintStream out) {
    out.println("\\documentclass{article}");
    out.println("\\usepackage{tikz}");
    out.println("\\usepackage{xcolor}");
    out.println("\\newcounter{cnt}");
    out.println("\\setlength{\\parindent}{0pt}");
    out.println("\\begin{document}");
  }

  private static void tikzTrailer(final PrintStream out) {
    out.println("\\end{document}");
  }

  private static void tikzColorSpec(final PrintStream out) {
    for (int k = 0; k < COLORS.length; ++k) {
      final Color col = COLORS[k];
      final int r = col.getRed() * (256 - col.getAlpha()) / 256;
      final int g = col.getGreen() * (256 - col.getAlpha()) / 256;
      final int b = col.getBlue() * (256 - col.getAlpha()) / 256;
      out.println("\\definecolor{c" + (char) ('a' + k) + "}{RGB}{" + r + "," + g + "," + b + "}");
    }
  }

  private static String toTikz(final long x, final long y, final String modifier) {
    return "\\draw" + modifier + " (" + x + "," + y + ")--(" + (x + 1) + "," + y + ")--(" + (x + 1) + "," + (y + 1) + ")--(" + x + "," + (y + 1) + ")--cycle;";
  }

  private static void toTikz(final PrintStream out, final List<Integer> square) {
    out.println("\\begin{tabular}{c}");
    out.println("\\begin{tikzpicture}[scale=0.25]");
    for (int k = 0; k < square.size(); ++k) {
      final int x = square.get(k) % SIZE;
      final int y = square.get(k) / SIZE;
      out.println(toTikz(x, y, "[fill=c" + (char) ('a' + k / 8) + "]"));
      out.println(toTikz(x, y, ""));
    }
    out.println("\\end{tikzpicture}\\\\");
    out.println("\\thecnt");
    out.println("\\end{tabular}");
    out.println("\\addtocounter{cnt}{1}");
  }

  /**
   * Output pictures.
   * Usage:
   * <pre>
   *   java PlotA363381 jpeg outdir [#images] <8x8squaresNumb.txt
   * </pre>
   * @param args see Usage above
   * @throws IOException if an I/O error occurs
   */
  public static void main(final String[] args) throws IOException {
    final String outputType = args[0];
    final File outputDir = new File(args[1]);
    outputDir.mkdirs();
    final int maxPic = args.length > 2 ? Integer.parseInt(args[2]) : Integer.MAX_VALUE;
    int pic = 0;
    try (final PrintStream tikzOut = new PrintStream(new File(outputDir, "tikz.tex"))) {
      if ("tikz".equals(outputType)) {
        tikzHeader(tikzOut);
        tikzColorSpec(tikzOut);
      }
      try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
        String line;
        while ((line = r.readLine()) != null) {
          final String[] parts = line.trim().split("\\s+");
          if (parts.length != SIZE * SIZE) {
            throw new IOException("Unexpected input: " + line + " (on line " + pic + " of input file)");
          }
          final ArrayList<Integer> square = new ArrayList<>();
          for (final String p : parts) {
            square.add(Integer.parseInt(p));
          }
          if ("tikz".equals(outputType)) {
            if (pic % 5 == 0) {
              tikzOut.println(); // New row
            }
            toTikz(tikzOut, square);
          } else {
            draw(outputType, outputDir, square, pic);
          }
          System.out.print("\rWrote image: " + pic);
          System.out.flush();
          if (++pic >= maxPic) {
            break;
          }
        }
      }
      tikzTrailer(tikzOut);
    }
    System.out.println();
    System.out.println("Finished");
  }
}
