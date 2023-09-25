package irvine.oeis.a065;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.a005.A005446;

/**
 * A065973 Denominators in an asymptotic expansion of Ramanujan.
 * @author Sean A. Irvine
 */
public class A065973 extends A005446 {

  private int mN = 0;
  {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    return get(2 * mN).multiply(MemoryFactorial.SINGLETON.factorial(mN).shiftLeft(mN)).den();
  }
}
