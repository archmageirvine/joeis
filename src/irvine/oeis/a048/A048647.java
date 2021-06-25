package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048647 Write n in base 4, then replace each digit with its base-4 negative.
 * @author Sean A. Irvine
 */
public class A048647 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final StringBuilder sb = new StringBuilder();
    long m = mN;
    while (m != 0) {
      sb.append((4 - (m & 3)) & 3);
      m >>>= 2;
    }
    return new Z(sb.reverse(), 4);
  }
}
