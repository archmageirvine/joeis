package irvine.oeis.a053;

import java.util.ArrayList;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a054.A054733;

/**
 * A053454 Number of weakly connected digraphs with n arcs.
 * @author Sean A. Irvine
 */
public class A053454 extends A054733 {

  {
    setOffset(0);
  }

  private final ArrayList<Polynomial<Z>> mA = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    int k = -1;
    while (true) {
      if (++k >= mA.size()) {
        mA.add(getRow(mA.size()));
      }
      final Polynomial<Z> row = mA.get(k);
      final Z t = row.coeff(mN - 1);
      if (t.isZero() && mN <= row.degree()) {
        return sum;
      }
      sum = sum.add(t);
    }
  }
}
