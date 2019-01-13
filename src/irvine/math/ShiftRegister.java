package irvine.math;

import java.io.PrintStream;

import irvine.util.string.PostScript;

/**
 * Utility functions associated with shift registers.
 *
 * @author Sean A. Irvine
 */
public final class ShiftRegister {

  private ShiftRegister() { }

  /** Overall sizing factor for EPS image. */
  private static final int SCALE = 40;
  /** Half scale. */
  private static final int HSCALE = SCALE >>> 1;
  /** Quarter scale. */
  private static final int QSCALE = HSCALE >>> 1;

  /**
   * Write an encapsulated PostScript stream for an image representing a linear
   * feedback shift register defined by a fill and tap sequence. The number of
   * stages in the register is determined by the length of the fill. The resulting
   * EPS stream may be broken if the fill contains non-alphanumeric characters.
   *
   * @param ps stream to write to
   * @param fill fill values for each stage
   * @param taps tapped stages
   * @exception NullPointerException if <code>ps</code> or <code>fill</code> is null.
   */
  public static void registerToEPS(final PrintStream ps, final String fill, final int[] taps) {
    final int len = fill.length();
    PostScript.header(ps, ShiftRegister.class, "Shift Register", (len + 2) * SCALE + HSCALE, 2 * SCALE + HSCALE);
    ps.println("/Times-Roman findfont " + HSCALE + " scalefont setfont");
    // print boxes and fills
    for (int k = 0; k < len; ++k) {
      final int l = (k + 1) * SCALE;
      final int r = l + SCALE;
      // draw the box
      ps.println("newpath " + l + " " + SCALE + " moveto " + r + " " + SCALE + " lineto " + r + " 0 lineto " + l + " 0 lineto closepath stroke");
      // draw the fill
      final char c = fill.charAt(k);
      ps.println("newpath " + (l + HSCALE) + " (" + c + ") stringwidth pop 2 div sub " + 0.375 * SCALE + " moveto (" + c + ") show");
    }
    // draw output arrow
    ps.println("newpath " + SCALE + " " + HSCALE + " moveto " + QSCALE + " " + HSCALE + " lineto stroke");
    ps.println("newpath " + QSCALE + " " + HSCALE + " moveto " + HSCALE + " " + 3 * QSCALE + " lineto " + HSCALE + " " + QSCALE + " lineto closepath fill");
    if (taps.length > 0) {
      // draw the input lines
      final int r = (len + 2) * SCALE;
      ps.println("newpath " + r + " " + HSCALE + " moveto " + (len + 1) * SCALE + " " + HSCALE + " lineto stroke");
      final int rr = r - SCALE;
      ps.println("newpath " + rr + " " + HSCALE + " moveto " + (rr + QSCALE) + " " + (HSCALE + QSCALE) + " lineto " + (rr + QSCALE) + " " + (HSCALE - QSCALE) + " lineto closepath fill");
      // handle leftmost tap and main line
      final int l = (taps[0] + 1) * SCALE + HSCALE;
      ps.println("newpath " + l + " " + SCALE + " moveto " + l + " " + 2 * SCALE + " lineto " + r + " " + 2 * SCALE + " lineto " + r + " " + HSCALE + " lineto stroke");
      // handle rest of the taps
      for (int k = 1; k < taps.length; ++k) {
        final int lk = (taps[k] + 1) * SCALE + HSCALE;
        ps.println("newpath " + lk + " " + SCALE + " moveto " + lk + " " + (2 * SCALE + QSCALE) + " lineto stroke");
        ps.println("newpath " + lk + " " + 2 * SCALE + " " + QSCALE + " 0 360 arc stroke");
      }
    }
    PostScript.trailer(ps);
  }

  /**
   * Produce a PostScript rendition of a register.
   *
   * @param args register specification
   */
  public static void main(final String[] args) {
    if (args.length == 2) {
      final String[] parts = args[1].split(",");
      final int[] taps = new int[parts.length];
      for (int k = 0; k < parts.length; ++k) {
        taps[k] = Integer.parseInt(parts[k]);
      }
      registerToEPS(System.out, args[0], taps);
    }
  }
}

