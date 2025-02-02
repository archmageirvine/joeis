package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a031.A031312;

/**
 * A073428 First n-digit prime in the concatenation of odd integers forbidding leading zeros.
 * @author Sean A. Irvine
 */
public class A073428 extends Sequence1 {

  private Z mMod = Z.ONE;

  @Override
  public Z next() {
    final Z min = mMod;
    mMod = mMod.multiply(10);
    final Sequence digits = new A031312();
    Z t = Z.ZERO;
    while (true) {
      t = t.modMultiply(Z.TEN, mMod).add(digits.next());
      if (t.compareTo(min) >= 0 && t.isProbablePrime()) {
        return t;
      }
    }
  }
}
