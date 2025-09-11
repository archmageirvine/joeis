package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002858;

/**
 * A080287 Successively larger gaps in Ulam numbers start at this Ulam number.
 * @author Sean A. Irvine
 */
public class A080287 extends Sequence1 {

  private final Sequence mUlam = new A002858();
  private Z mA = mUlam.next();
  private Z mGap = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mUlam.next();
      final Z g = mA.subtract(t);
      if (g.compareTo(mGap) > 0) {
        mGap = g;
        return t;
      }
    }
  }
}

