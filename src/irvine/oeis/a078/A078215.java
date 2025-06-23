package irvine.oeis.a078;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078204.
 * @author Sean A. Irvine
 */
public class A078215 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final String s = String.valueOf(mN);
    Z t = mA;
    while (true) {
      t = t.add(mA);
      if (Predicates.SQUARE.is(t) && t.toString().startsWith(s)) {
        mA = t;
        return t;
      }
    }
  }
}

