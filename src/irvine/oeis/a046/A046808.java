package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046808 Recursive sequence of indices of Proth primes a*2^b + 1.
 * @author Sean A. Irvine
 */
public class A046808 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      int s = mA.intValueExact();
      Z t = mA.shiftLeft(s);
      do {
        ++s;
        t = t.multiply2();
      } while (!t.add(1).isProbablePrime());
      mA = Z.valueOf(s);
    }
    return mA;
  }
}
