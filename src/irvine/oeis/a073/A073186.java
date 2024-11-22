package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a036.A036211;

/**
 * A073186 First n-digit prime in "the sequence of even integers": 246810121416182022242628303234...
 * @author Sean A. Irvine
 */
public class A073186 extends Sequence1 {

  private Z mMod = Z.ONE;

  @Override
  public Z next() {
    final Z min = mMod;
    mMod = mMod.multiply(10);
    final Sequence digits = new A036211();
    Z t = Z.ZERO;
    while (true) {
      t = t.modMultiply(Z.TEN, mMod).add(digits.next());
      if (t.compareTo(min) >= 0 && t.isProbablePrime()) {
        return t;
      }
    }
  }
}
