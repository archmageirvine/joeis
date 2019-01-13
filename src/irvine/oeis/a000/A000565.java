package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000565.
 * @author Sean A. Irvine
 */
public class A000565 implements Sequence {

  private long mN = 6;

  private static final long[] CONSTANTS = {
    12154480,
    -11470340,
    4606392,
    -1005795,
    125685,
    -8505,
    243,
  };

  @Override
  public Z next() {
    ++mN;
    Z n = Z.ONE;
    Z s = Z.ZERO;
    for (final long c : CONSTANTS) {
      n = n.multiply(mN);
      s = s.add(n.multiply(c));
    }
    return s.divide(560);
  }
}

