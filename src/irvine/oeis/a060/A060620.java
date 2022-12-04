package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a007.A007504;

/**
 * A060620 Average of the first n primes rounded down.
 * @author Sean A. Irvine
 */
public class A060620 extends A007504 {

  private long mN = 0;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
