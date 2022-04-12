package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056004 Initial step in Goodstein sequences: write n in hereditary representation base 2, bump to base 3, then subtract 1.
 * @author Sean A. Irvine
 */
public class A056004 implements Sequence {

  private long mN = 0;

  private Z code(final long n) {
    Z sum = Z.ZERO;
    long m = n;
    int k = 0;
    while (m != 0) {
      if ((m & 1) == 1) {
        sum = sum.add(Z.THREE.pow(k < 2 ? k : code(k).longValueExact() + 1));
      }
      m >>>= 1;
      ++k;
    }
    return sum.subtract(1);
  }

  @Override
  public Z next() {
    return code(++mN);
  }
}
