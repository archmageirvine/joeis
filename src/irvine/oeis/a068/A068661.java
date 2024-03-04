package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033307;

/**
 * A068661 Let N = 123456789101112131415... the concatenation of natural numbers; partition this number into minimal strings of noncomposite numbers, i.e., a(1) = 1 and a(2) onwards are primes.
 * @author Sean A. Irvine
 */
public class A068661 extends Sequence1 {

  private boolean mFirst = true;
  private final Sequence mA = new A033307();

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return mA.next();
    }
    Z t = Z.ZERO;
    while (true) {
      t = t.multiply(10).add(mA.next());
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
