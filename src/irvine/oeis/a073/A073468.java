package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a036.A036211;

/**
 * A073468 First n-digit prime in "the sequence of even integers": 246810121416182022242628303234...
 * @author Sean A. Irvine
 */
public class A073468 extends Sequence1 {

  private long mN = 0;
  private Z mMod = Z.ONE;

  @Override
  public Z next() {
    mMod = mMod.multiply(10);
    final Sequence digits = new A036211();
    Z t = Z.ZERO;
    ++mN;
    for (long k = 0; k < mN; ++k) {
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
