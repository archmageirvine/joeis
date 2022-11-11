package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A060331 Primes the sum of six consecutive composite numbers.
 * @author Sean A. Irvine
 */
public class A060331 extends Sequence1 {

  private final Sequence mV = new A002808();
  private Z mD = mV.next();
  private Z mE = mV.next();
  private Z mF = mV.next();
  private Z mG = mV.next();
  private Z mH = mV.next();

  @Override
  public Z next() {
    while (true) {
      final Z c = mD;
      mD = mE;
      mE = mF;
      mF = mG;
      mG = mH;
      mH = mV.next();
      final Z sum = c.add(mD).add(mE).add(mF).add(mG).add(mH);
      if (sum.isProbablePrime()) {
        return sum;
      }
    }
  }
}
