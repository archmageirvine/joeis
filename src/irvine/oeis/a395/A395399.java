package irvine.oeis.a395;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395399 Number of unsatisfiable 3-SAT formulas with 3 variables and n clauses in the multiset clause model.
 * @author Sean A. Irvine
 */
public class A395399 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 55, mN)
      .subtract(Binomial.binomial(mN + 45, mN).multiply(8))
      .add(Binomial.binomial(mN + 39, mN).multiply(12))
      .add(Binomial.binomial(mN + 36, mN).multiply(12))
      .add(Binomial.binomial(mN + 35, mN).multiply(4))
      .subtract(Binomial.binomial(mN + 33, mN).multiply(24))
      .subtract(Binomial.binomial(mN + 30, mN).multiply(18))
      .subtract(Binomial.binomial(mN + 28, mN).multiply(8))
      .add(Binomial.binomial(mN + 27, mN).multiply(32))
      .add(Binomial.binomial(mN + 25, mN).multiply(30))
      .subtract(Binomial.binomial(mN + 24, mN).multiply(24))
      .subtract(Binomial.binomial(mN + 22, mN).multiply(24))
      .add(Binomial.binomial(mN + 21, mN).multiply(14))
      .subtract(Binomial.binomial(mN + 20, mN).multiply(8))
      .add(Binomial.binomial(mN + 19, mN).multiply(16))
      .subtract(Binomial.binomial(mN + 18, mN).multiply(8))
      .add(Binomial.binomial(mN + 17, mN));
  }
}

