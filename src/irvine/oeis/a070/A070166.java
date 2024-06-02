package irvine.oeis.a070;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.PairMultiply;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070166 Irregular triangle read by rows giving T(n,k) = number of rooted graphs on n + 1 nodes with k edges (n &gt;= 0, 0 &lt;= k &lt;= n(n-1)/2).
 * @author Sean A. Irvine
 */
public class A070166 extends Sequence0 {

  private Polynomial<Q> mRow = Polynomial.create(Q.ZERO);
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      if (++mN == 0) {
        return Z.ONE;
      }
      mM = 0;
      final CycleIndex zn = SymmetricGroup.create(mN).cycleIndex();
      final MultivariateMonomial m = new MultivariateMonomial();
      m.add(1, 1);
      final CycleIndex c = zn.multiply(m);
      final CycleIndex pair = c.op(PairMultiply.OP, c);
      mRow = pair.applyOnePlusXToTheN();
    }
    return mRow.coeff(mM).toZ();
  }
}
