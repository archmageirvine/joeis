package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a031.A031312;

/**
 * A073176 First n-digit prime in "the sequence of odd integers": 135791113151719212325272931333537394143454749...
 * @author Sean A. Irvine
 */
public class A073176 extends Sequence1 {

  private Z mMod = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mMod = mMod.multiply(10);
    final Sequence digits = new A031312();
    Z t = Z.ZERO;
    ++mN;
    // Initial run up to ensure left most starting digit is nonzero
    for (int k = 0; k < mN - 1; ++k) {
      t = t.modMultiply(Z.TEN, mMod).add(digits.next());
    }
    while (true) {
      t = t.modMultiply(Z.TEN, mMod).add(digits.next());
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
