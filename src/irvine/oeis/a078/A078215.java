package irvine.oeis.a078;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078215 a(1) = 1; a(n) for n &gt; 1 is the smallest multiple of a(n-1) that is a square and begins with n.
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

