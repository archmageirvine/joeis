package irvine.oeis.a151;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A151738 Primes which are the sum of nine consecutive composite numbers.
 * @author Sean A. Irvine
 */
public class A151738 extends Sequence1 {

  private final Sequence mV = new A002808();
  private Z mD = mV.next();
  private Z mE = mV.next();
  private Z mF = mV.next();
  private Z mG = mV.next();
  private Z mH = mV.next();
  private Z mI = mV.next();
  private Z mJ = mV.next();
  private Z mK = mV.next();

  @Override
  public Z next() {
    while (true) {
      final Z c = mD;
      mD = mE;
      mE = mF;
      mF = mG;
      mG = mH;
      mH = mI;
      mI = mJ;
      mJ = mK;
      mK = mV.next();
      final Z sum = c.add(mD).add(mE).add(mF).add(mG).add(mH).add(mI).add(mJ).add(mK);
      if (sum.isProbablePrime()) {
        return sum;
      }
    }
  }
}
