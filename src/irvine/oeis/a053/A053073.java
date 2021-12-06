package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a052.A052189;

/**
 * A053073 Balanced primes separated from the next lower and next higher prime neighbors by 18.
 * @author Sean A. Irvine
 */
public class A053073 extends A052189 {

  @Override
  public Z next() {
    return super.next().add(18);
  }
}
