package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A001678 Number of series-reduced planted trees with n nodes.
 * @author Sean A. Irvine
 */
public class A001678 extends MemorySequence {

  /** Higher limit takes longer timer. */
  private static final int LIMIT = 500;
  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;
  private Polynomial<Z> mDen = null;

  @Override
  protected Z computeNext() {
    if (++mN > LIMIT) {
      throw new UnsupportedOperationException();
    }
    if (mN < 5) {
      return mN == 2 || mN == 4 ? Z.ONE : Z.ZERO;
    }
    if (mDen == null) {
      mDen = RING.create(Arrays.asList(Z.ONE, Z.ZERO, Z.NEG_ONE, Z.NEG_ONE, Z.ZERO, Z.ONE));
    } else {
      final ArrayList<Z> t = new ArrayList<>();
      t.add(Z.ONE);
      for (int k = 1; k < mN - 2; ++k) {
        t.add(Z.ZERO);
      }
      t.add(Z.NEG_ONE);
      final Polynomial<Z> p = RING.powz(RING.create(t), get(mN - 1), LIMIT);
      mDen = RING.multiply(mDen, p, LIMIT);
    }

    final Z[] c = new Z[mN - 1];
    Arrays.fill(c, Z.ZERO);
    c[0] = Z.ONE;
    for (int p = 0; p < c.length; ++p) {
      final Z t = c[p];
      for (int q = p + 1, k = 1; q < c.length; ++q, ++k) {
        c[q] = c[q].subtract(t.multiply(mDen.coeff(k)));
      }
    }
    return c[mN - 2];
  }
}

