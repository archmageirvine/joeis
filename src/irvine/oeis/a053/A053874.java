package irvine.oeis.a053;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053874 Triangle T(n,k) = number of Boolean functions mapping {0,1}^n to {0,1}^n with image of size k (k = 0...2^n) under action of GL(n,2).
 * @author Sean A. Irvine
 */
public class A053874 extends Sequence1 {

  private Polynomial<Q> mA = Polynomial.create(new Q[0]);
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mA.degree()) {
      mA = new GeneralLinearGroup<>(++mN, new GaloisField(2)).cycleIndex().applyOnePlusXToTheN();
      mM = 0;
    }
    return mA.coeff(mM).toZ();
  }
}
