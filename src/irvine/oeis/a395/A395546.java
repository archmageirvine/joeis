package irvine.oeis.a395;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a396.A396491;

/**
 * A395546 allocated for Ramin Mohammadi Masoudi.
 * @author Sean A. Irvine
 */
public class A395546 extends A396491 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(Binomial.binomial(2 * mN + 2, 3).add(4), 5).subtract(super.next());
  }
}
