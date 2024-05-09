package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a207.A207329;

/**
 * A069625 Number of distinct numbers that can be formed as a product of two or more divisors of n.
 * @author Sean A. Irvine
 */
public class A069625 extends A207329 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
