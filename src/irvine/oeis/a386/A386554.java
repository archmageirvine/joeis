package irvine.oeis.a386;

import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A386554 Number of 2-colorings of an 4 X 4 X 4 grid, up to rotational symmetry, by the number of black cells.
 * @author Sean A. Irvine
 */
public class A386554 extends Sequence0 {

  private final Polynomial<Q> mS;
  private int mN = 0;

  /** Construct the sequence. */
  public A386554() {
    final MultivariateMonomial mm1 = MultivariateMonomial.create(1, 4, Q.EIGHT);
    mm1.add(3, 20);
    final CycleIndex ci = new CycleIndex("C",
      MultivariateMonomial.create(1, 64, Q.ONE),
      mm1,
      MultivariateMonomial.create(2, 32, Q.NINE),
      MultivariateMonomial.create(4, 16, Q.SIX)
    );
    ci.multiply(new Q(1, 24));
    mS = ci.applyOnePlusXToTheN();
  }

  @Override
  public Z next() {
    if (mN > mS.degree()) {
      return null;
    }
    return mS.coeff(mN++).toZ();
  }
}

