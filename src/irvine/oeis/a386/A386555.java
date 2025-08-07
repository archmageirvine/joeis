package irvine.oeis.a386;

import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A386555 Number of 2-colorings of an 5 X 5 X 5 grid, up to rotational symmetry, by the number of black cells.
 * @author Sean A. Irvine
 */
public class A386555 extends Sequence0 {

  private final Polynomial<Q> mS;
  private int mN = 0;

  // 1/24 a[1]^125 + 1/3 a[1]^5 * a[3]^40 + 3/8 * a[1]^5 * a[2]^60 + 1/4 * a[1]^5 * a[4]^30.

  /** Construct the sequence. */
  public A386555() {
    final MultivariateMonomial mm1 = MultivariateMonomial.create(1, 5, Q.EIGHT);
    mm1.add(3, 40);
    final MultivariateMonomial mm2 = MultivariateMonomial.create(1, 5, Q.NINE);
    mm2.add(2, 60);
    final MultivariateMonomial mm3 = MultivariateMonomial.create(1, 5, Q.SIX);
    mm3.add(4, 30);
    final CycleIndex ci = new CycleIndex("C",
      MultivariateMonomial.create(1, 125, Q.ONE),
      mm1,
      mm2,
      mm3
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

