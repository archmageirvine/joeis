package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080208 a(n) is the least k such that the generalized Fermat number (k+1)^(2^n) + k^(2^n) is prime.
 * @author Sean A. Irvine
 */
public class A080208 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z p = Z.ONE.shiftLeft(++mN);
    long k = 0;
    while (true) {
      ++k;
      if (Z.valueOf(k + 1).pow(p).add(Z.valueOf(k).pow(p)).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

