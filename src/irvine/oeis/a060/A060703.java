package irvine.oeis.a060;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060703 Negative values of 2*x*y^4 + x^2*y^3 - 2*x^3*y*2 - x^4*y - y^5 + 2*y for x,y &gt;= 0.
 * @author Sean A. Irvine
 */
public class A060703 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mX = Z.NEG_ONE;

  private Z f(final Z x, final Z y) {
    final Z y2 = y.multiply(y);
    final Z y3 = y2.multiply(y);
    final Z y4 = y3.multiply(y);
    final Z x2 = x.multiply(x);
    final Z x3 = x2.multiply(x);
    final Z x4 = x3.multiply(x);
    return y4.multiply(x).multiply2()
      .add(y3.multiply(x2))
      .subtract(y2.multiply(x3).multiply2())
      .subtract(y.multiply(x4))
      .subtract(y4.multiply(y))
      .add(y.multiply2());
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mX) >= 0) {
      mX = mX.add(1);
      for (Z y = Z.ZERO; y.compareTo(mX) <= 0; y = y.add(1)) {
        final Z f = f(mX, y);
        if (f.signum() < 0) {
          mA.add(f.negate());
        }
        if (!y.equals(mX)) {
          final Z g = f(y, mX);
          if (g.signum() < 0) {
            mA.add(g.negate());
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
