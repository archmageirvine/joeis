package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077193.
 * @author Sean A. Irvine
 */
public class A077209 extends Sequence1 {

  private Z mT = Z.ONE;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    final String s = mA.toString();
    if (s.length() == 1 || s.charAt(s.length() - 1) < s.charAt(0)) {
      mT = mT.multiply(10);
      mA = mT.multiply(mA.mod(10));
    } else if (s.charAt(s.length() - 1) != s.charAt(0)) {
      mA = mT.multiply(mA.mod(10));
    }
    do {
      mA = mA.add(1);
    } while (!Predicates.SQUARE_FREE.is(mA));
    return mA;
  }
}

