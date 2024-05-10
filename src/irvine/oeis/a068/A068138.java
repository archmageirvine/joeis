package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000040;

/**
 * A068138 Primes in the mirror concatenation of primes without reversal.
 * @author Sean A. Irvine
 */
public class A068138 extends Sequence0 {

  private final StringBuilder mA = new StringBuilder();
  private final A000040 mSeq = new A000040();

  @Override
  public Z next() {
    while (true) {
      final Z p = mSeq.next();
      if (mA.length() == 0) {
        mA.append(p);
      } else {
        mA.insert(0, p).append(p);
      }
      final Z t = new Z(mA);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
