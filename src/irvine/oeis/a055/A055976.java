package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055976 Remainder when (n-1)! + 1 is divided by n.
 * @author Sean A. Irvine
 */
public class A055976 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long f = 1;
    for (long k = 2; k < mN; ++k) {
      f *= k;
      f %= mN;
    }
    return Z.valueOf((f + 1) % mN);
  }
}
