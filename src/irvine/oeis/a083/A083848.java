package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083848 a(n)^2 + 1 is largest prime of the form x^2 + 1 &lt;= 2^n.
 * @author Sean A. Irvine
 */
public class A083848 extends Sequence1 {

  private Z mLim = Z.ONE;

  @Override
  public Z next() {
    mLim = mLim.multiply2();
    Z s = mLim.sqrt();
    while (true) {
      final Z v = s.square().add(1);
      if (v.compareTo(mLim) <= 0 && v.isProbablePrime()) {
        return s;
      }
      s = s.subtract(1);
    }
  }
}
