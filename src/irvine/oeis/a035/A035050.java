package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035050 a(n) is the smallest k such that k*2^n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A035050 extends Sequence0 {

  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply2();
    long k = 1;
    while (!mT.multiply(k).add(1).isProbablePrime()) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
