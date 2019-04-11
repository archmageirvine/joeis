package irvine.oeis.a000;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.io.StreamProcessor;

/**
 * A000946 Euclid-Mullin sequence: <code>a(1) = 2, a(n+1)</code> is largest prime factor of Product_{k=1..n} <code>a(k) + 1</code>.
 * @author Sean A. Irvine
 */
public class A000946 extends StreamProcessor implements Sequence {

  private final ArrayList<Z> mSeq = new ArrayList<>();
  private int mPos = -1;

  /**
   * Construct this sequence.
   *
   * @exception IOException if an I/O error occurs
   */
  public A000946() throws IOException {
    final InputStream input = getClass().getClassLoader().getResourceAsStream("irvine/factor/project/oeis/a000946");
    if (input != null) {
      // Read from a trusted resource
      try {
        process(input);
      } finally {
        input.close();
      }
    }
  }

  @Override
  public void process(final String line) throws IOException {
    final int sp = line.indexOf(' ');
    if (sp == -1) {
      throw new IOException(line);
    }
    try {
      final int pos = Integer.parseInt(line.substring(0, sp));
      if (pos != mSeq.size() + 1) {
        throw new IOException(line);
      }
      final int dot = Math.max(sp, line.lastIndexOf('.'));
      if (line.charAt(dot + 1) != '(') {
        mSeq.add(new Z(line.substring(dot + 1)));
      }
    } catch (final NumberFormatException e) {
      throw new IOException("Malformed line: " + line, e);
    }
  }

  @Override
  public Z next() {
    if (++mPos == mSeq.size()) {
      throw new UnsupportedOperationException();
    }
    return mSeq.get(mPos);
  }
}
