package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007001 Trajectory of 1 under the morphism <code>1 -&gt; 12, 2 -&gt; 123, 3 -&gt; 1234,</code> etc.
 * @author Sean A. Irvine
 */
public class A007001 implements Sequence {

  private static final String[] REPLACEMENTS = {null, "12", "123", "1234", "12345", "123456", "1234567", "12345678", "123456789", "123456789A"};
  private final StringBuilder mSeq = new StringBuilder("12");
  private int mN = -1;

  @Override
  public Z next() {
    final int r = mSeq.charAt(++mN) - '0';
    if (r >= REPLACEMENTS.length) {
      throw new UnsupportedOperationException();
    }
    if (mN > 0) {
      mSeq.append(REPLACEMENTS[r]);
    }
    return Z.valueOf(r);
  }

}

