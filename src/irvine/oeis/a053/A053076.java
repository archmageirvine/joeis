package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a052.A052197;

/**
 * A053076 Balanced primes separated from the next lower and next higher prime neighbors by 36.
 * @author Sean A. Irvine
 */
public class A053076 extends A052197 {

  @Override
  public Z next() {
    return super.next().add(36);
  }
}
