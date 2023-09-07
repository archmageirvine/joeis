package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065610 Smallest number m so that n^2 + A000330(m) is also a square, i.e., n^2 + (1 + 4 + 9 + 16 + ... + m^2) = w^2 for some w.
 * @author Sean A. Irvine
 */
public class A065610 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z s = Z.valueOf(++mN).square();
    long k = 0;
    while (true) {
      if (s.add(Z.valueOf(++k).multiply(k + 1).multiply(2 * k + 1).divide(6)).isSquare()) {
        return Z.valueOf(k);
      }
    }
  }
}
