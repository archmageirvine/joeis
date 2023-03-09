package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A061742 a(n) is the square of the product of first n primes.
 * @author Sean A. Irvine
 */
public class A061742 extends A002110 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
