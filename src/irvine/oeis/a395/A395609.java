package irvine.oeis.a395;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a396.A396351;

/**
 * A395609 Number of satisfiable 3-SAT formulas with n variables and 6 clauses in the multiset clause model.
 * @author Sean A. Irvine
 */
public class A395609 extends A396351 {

  private int mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(Binomial.binomial(2L * ++mN + 2, 3).add(5), 6).subtract(t(mN, 6));
  }
}
