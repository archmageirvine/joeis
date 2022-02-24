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

  private final ArrayList<Polynomial<Z>> mA = new ArrayList<>();
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN <= 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    int k = -1;
    while (true) {
      if (++k >= mA.size()) {
        mA.add(getRow(mA.size() + 2));
      }
      final Polynomial<Z> row = mA.get(k);
      final Z t = row.coeff(mN);
      if (t.isZero() && mN <= row.degree()) {
        return sum;
      }
      sum = sum.add(t);
    }
  }
}
