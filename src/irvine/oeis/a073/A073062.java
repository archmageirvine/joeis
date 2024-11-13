package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033308;

/**
 * A073047.
 * @author Sean A. Irvine
 */
public class A073062 extends Sequence1 {

  private Z mMod = Z.ONE;

  @Override
  public Z next() {
    final Z min = mMod;
    mMod = mMod.multiply(10);
    final Sequence primeDigits = new A033308();
    Z v = Z.ZERO;
    while (true) {
      v = v.modMultiply(10, mMod).add(primeDigits.next());
      if (v.compareTo(min) >= 0 && v.isProbablePrime()) {
        return v;
      }
    }
  }
}
