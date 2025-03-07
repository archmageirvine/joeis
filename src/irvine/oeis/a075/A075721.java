package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a056.A056240;

/**
 * A075721 a(n+1) = least k with sum of prime factors (with repetition) = a(n)+1 with a(0) = 2.
 * @author Sean A. Irvine
 */
public class A075721 extends Sequence0 {

  // After David Wasserman

  private static final Z[] SMALL = {Z.TWO, Z.THREE, Z.FOUR, Z.FIVE, Z.EIGHT};
  private Z mA = null;
  private int mN = 0;
  private final DirectSequence mV = DirectSequence.create(2, new A056240());

  @Override
  public Z next() {
    if (mN < SMALL.length) {
      mA = SMALL[mN++];
    } else {
      Z p = Functions.PREV_PRIME.z(mA.add(2));
      if (p.equals(mA.add(1))) {
        mA = p;
      } else {
        final Z n1 = mA.add(1);
        Z b = mV.a(n1.subtract(p));
        Z c = p;
        while (b.compareTo(n1.subtract(p)) > 0) {
          p = Functions.PREV_PRIME.z(p);
          final Z m = mV.a(n1.subtract(p));
          if (m.compareTo(b) < 0) {
            b = m;
            c = p;
          }
        }
        mA = b.multiply(c);
      }
    }
    return mA;
  }
}
