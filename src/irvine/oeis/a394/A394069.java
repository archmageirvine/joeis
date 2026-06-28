package irvine.oeis.a394;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394069 Number of unsatisfiable 3-SAT formulas with 2 variables and n clauses in the multiset clause model.
 * @author Sean A. Irvine
 */
public class A394069 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 19, mN)
      .subtract(Binomial.binomial(mN + 15, mN).multiply(4))
      .add(Binomial.binomial(mN + 12, mN).multiply(4))
      .add(Binomial.binomial(mN + 11, mN).multiply2())
      .subtract(Binomial.binomial(mN + 9, mN).multiply(4))
      .add(Binomial.binomial(mN + 7, mN));
  }
}
