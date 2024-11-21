package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033307;

/**
 * A073175 First occurrence of an n-digit prime as a substring in the concatenation of the natural numbers 12345678910111213141516171819202122232425262728293031....
 * @author Sean A. Irvine
 */
public class A073175 extends Sequence1 {

  private Z mMod = Z.ONE;

  @Override
  public Z next() {
    Z min = mMod;
    mMod = mMod.multiply(10);
    final Sequence digits = new A033307();
    Z t = Z.ZERO;
    while (true) {
      t = t.modMultiply(Z.TEN, mMod).add(digits.next());
      if (t.compareTo(min) >= 0 && t.isProbablePrime()) {
        return t;
      }
    }
  }
}
