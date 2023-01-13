package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060985 a(1) = 1; a(n+1) = a(n) + (largest triangular number &lt;= a(n)).
 * @author Sean A. Irvine
 */
public class A060985 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z t = mA.multiply(8).add(1).sqrt().subtract(1).divide2();
      mA = mA.add(t.multiply(t.add(1)).divide2());
    }
    return mA;
  }
}
