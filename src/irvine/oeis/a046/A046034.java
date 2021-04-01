package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a084.A084544;

/**
 * A046034 Numbers whose digits are primes.
 * @author Sean A. Irvine
 */
public class A046034 extends A084544 {

  @Override
  public Z next() {
    return new Z(super.next().toString().replace('4', '7').replace('3', '5').replace('2', '3').replace('1', '2'));
  }
}
