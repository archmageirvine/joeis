package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057778 a(n) is the least odd k such that k*2^n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A057778 extends Sequence0 {

  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply2();
    long k = 1;
    while (!mT.multiply(k).add(1).isProbablePrime()) {
      k += 2;
    }
    return Z.valueOf(k);
  }
}
