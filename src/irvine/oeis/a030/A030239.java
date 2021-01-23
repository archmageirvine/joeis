package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030239 a(n) is the smallest number k such that k*2^(2^n) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A030239 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 30) {
      throw new UnsupportedOperationException();
    }
    final int shift = 1 << mN;
    long k = 1;
    while (!Z.valueOf(k).shiftLeft(shift).add(1).isProbablePrime()) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
