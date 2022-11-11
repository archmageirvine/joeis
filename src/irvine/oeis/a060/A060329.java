package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A060329 Primes the sum of four consecutive composite numbers.
 * @author Sean A. Irvine
 */
public class A060329 extends Sequence1 {

  private final Sequence mV = new A002808();
  private Z mD = mV.next();
  private Z mE = mV.next();
  private Z mF = mV.next();

  @Override
  public Z next() {
    while (true) {
      final Z c = mD;
      mD = mE;
      mE = mF;
      mF = mV.next();
      final Z sum = c.add(mD).add(mE).add(mF);
      if (sum.isProbablePrime()) {
        return sum;
      }
    }
  }
}
