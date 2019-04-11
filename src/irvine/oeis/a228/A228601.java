package irvine.oeis.a228;

import java.util.ArrayList;
import java.util.List;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a214.A214568;

/**
 * A228601 Triangle read by rows: T(n,k) is the number of trees with n vertices and having k distinct rootings <code>(1 &lt;=</code> k <code>&lt;= n)</code>.
 * @author Sean A. Irvine
 */
public class A228601 extends A214568 {

  private static final Polynomial<Z> TWO = Polynomial.create(2);
  private Polynomial<Polynomial<Z>> mA = mT;
  private int mN = 0;
  private int mK = 0;
  private int mRow = 1;

  protected Z a(final int p, final int k) {
    while (p > mRow) {
      stepA();
    }
    return mA.coeff(p).coeff(k);
  }

  private Polynomial<Polynomial<Z>> ySubstitutePower(final Polynomial<Polynomial<Z>> t, final int subs, final int maxDegree) {
    final List<Polynomial<Z>> res = new ArrayList<>();
    for (final Polynomial<Z> term : t) {
      res.add(term.substitutePower(subs, maxDegree));
    }
    return RING.create(res);
  }

  private void stepA() {
    ++mRow;
    t(mRow, 1); // ensures mT is updated
    final Polynomial<Polynomial<Z>> t2 = mT.substitutePower(2, mRow);
    mA = RING.add(RING.subtract(mT, RING.divide(RING.add(RING.pow(mT, 2, mRow), ySubstitutePower(t2, 2, mRow)), TWO)), t2);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      mK = 1;
      ++mN;
    }
    return a(mN, mK);
  }
}
