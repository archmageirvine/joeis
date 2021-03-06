package irvine.oeis;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import irvine.math.z.Z;

/**
 * Produce a sequence by reading the terms from the corresponding b-file.
 * This is used mainly for testing derived sequences when the underlying
 * sequence is not yet implemented in jOEIS.
 * It is similar to {@link CheatSequence}, which reads from a file in the jar
 * that has no indices before the terms.
 * The input file contains lines with tuples (index, term).
 * "#" and a following comment are stripped, and blank or empty lines are ignored.
 * <code>null</code> is returned after the last term.
 * The file is expected in a directory defined by the environment variable <code>BFPATH</code>.
 * @author Georg Fischer
 */
public class PseudoSequence implements Sequence, Closeable {

  protected final BufferedReader mLineReader;
  protected int mIndex = 0; // index of current term, modified by next()
  
  /**
   * Construct the sequence.
   * @param aseqno A-number of the sequence to be simulated from its b-file.
   * @throws FileNotFoundException if the corresponding b-file could not be found
   */
  public PseudoSequence(final String aseqno) throws FileNotFoundException {
    final String env = System.getenv("BFPATH"); // Use environment variable BFPATH if that is set
    final String bFilePath = env != null ? env : "../../../OEIS-mat/common/bfile/";
    final File fileName = new File(bFilePath, "b" + aseqno.substring(1) + ".txt");
    mLineReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8));
    //    try {
//      final ReadableByteChannel lineChannel = (new FileInputStream(fileName)).getChannel();
//      mLineReader = new BufferedReader(Channels.newReader(lineChannel, "UTF-8"));
//      System.out.println("fileName: " + fileName);
//    } catch (final Throwable exc) {
//      throw new RuntimeException("cannot read b-file for " + aseqno + ": " + exc.getMessage());
//    } // try
  }

  @Override
  public void close() throws IOException {
    mLineReader.close();
  }

  @Override
  public Z next() {
    try {
      while (true) {
        String line = mLineReader.readLine();
        if (line == null) { // EOF reached
          return null;
        } else {
          final int hashPos = line.indexOf('#');
          if (hashPos >= 0) { // hash found
            line = line.substring(0, hashPos); // remove comment
          }
          line = line.replaceAll("\\s+", " "); // beware of \t, \r whitespace
          line = line.trim(); // remove any surrounding space
          if (!line.isEmpty()) {
            final int spacePos = line.indexOf(' ');
            try {
              mIndex = Integer.parseInt(line.substring(0, spacePos));
            } catch (final NumberFormatException exc) {
              ++mIndex;
            }
            return new Z(line.substring(spacePos + 1));
          } // line not empty
        } // line != null
      } // while busy
    } catch (final Throwable exc) {
      throw new RuntimeException("cannot read b-file: " + exc.getMessage(), exc);
    } // try
  } // next
  
  /**
   * Gets the index of the term returned by the last call of <code>next()</code>
   * @return an int index
   */
  public int getIndex() {
    return mIndex;
  }
  
  /**
   * Reads a b-file a replicate it in b-file format
   * @param args command line argument: A-number
   */
  public static void main(final String[] args) throws IOException {
    final String aseqno = args[0];
    System.out.println("# b-file for " + aseqno + " generated by irvine.oeis.PseudoSequence");
    try (final PseudoSequence ps = new PseudoSequence(aseqno)) {
      Z term;
      while ((term = ps.next()) != null) {
        final int index = ps.getIndex();
        System.out.println(index + " " + term);
      }
    }
  } // main
}

