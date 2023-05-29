package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063970 a(1) = 2; for n&gt;1, write down all divisors of the previous term in order of magnitude.
 * @author Sean A. Irvine
 */
public class A063970 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      final StringBuilder sb = new StringBuilder();
      for (final Z d : Jaguar.factor(mA).divisorsSorted()) {
        sb.append(d);
      }
      mA = new Z(sb);
    }
    return mA;
  }
}

