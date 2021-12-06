package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a329.A329578;

/**
 * A053078 Balanced primes separated from the next lower and next higher prime neighbors by 48.
 * @author Sean A. Irvine
 */
public class A053078 extends A329578 {

  @Override
  public Z next() {
    return super.next().add(48);
  }
}
