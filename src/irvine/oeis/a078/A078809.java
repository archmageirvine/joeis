package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A078809 extends A065091 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Functions.SIGMA0.z(mPrime.nextPrime(p).add(p).divide2());
  }
}
