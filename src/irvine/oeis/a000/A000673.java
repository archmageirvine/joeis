package irvine.oeis.a000;

import java.io.Serializable;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000673 Number of bicentered 3-valent (or boron, or binary) trees with n nodes.
 * @author Sean A. Irvine
 */
public class A000673 extends Sequence0 implements Serializable {

  private static final CycleIndex CYCLE_INDEX = SymmetricGroup.create(2).cycleIndex();
  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mC = 0;

  private static final class Sym2 extends A000598 {
    private final int mC;

    private Sym2(final int c) {
      mC = c;
    }

    @Override
    protected CycleIndex cycleIndex() {
      return CYCLE_INDEX;
    }

    @Override
    protected int limit() {
      return mC;
    }
  }

  @Override
  public Z next() {
    if (++mC == 1) {
      return Z.ZERO;
    }
    final Sym2 aa = new Sym2(mC);
    aa.next();
    Polynomial<Q> oldG = aa.g();
    Q sum = Q.ZERO;
    for (int k = 0; k < mC; ++k) {
      aa.next();
      final Polynomial<Q> g = aa.g();
      final Polynomial<Q> tt = RING.subtract(g, oldG);
      oldG = g;
      // Compute (mC-1)th coefficient in tt^2
      Q a = Q.ZERO;
      for (int i = 0, j = mC - 1; i < mC; ++i, --j) {
        a = a.add(tt.coeff(i).multiply(tt.coeff(j)));
      }
      if ((mC & 1) == 1) {
        a = a.add(tt.coeff(mC / 2)); // actually (mC - 1) / 2
      }
      sum = sum.add(a.divide(2));
    }
    return sum.toZ();
  }
}
