package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a052.A052198;

/**
 * A053077 Balanced primes separated from the next lower and next higher prime neighbors by 42.
 * @author Sean A. Irvine
 */
public class A053077 extends A052198 {

  @Override
  public Z next() {
    return super.next().add(42);
  }
}
