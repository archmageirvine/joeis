package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000118;

/**
 * A046897 Sum of divisors of n that are not divisible by 4.
 * @author Sean A. Irvine
 */
public class A046897 extends A000118 {

  {
    super.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return super.next().divide(8);
  }
}
