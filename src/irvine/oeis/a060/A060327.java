package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A060327 Primes the sum of both two and three consecutive composite numbers.
 * @author Sean A. Irvine
 */
public class A060327 extends Sequence1 {

  private final Sequence mU = new A002808();
  private final Sequence mV = new A002808();
  private Z mA = mU.next();
  private Z mB = mU.next();
  private Z mC = mV.next();
  private Z mD = mV.next();
  private Z mE = mV.next();

  @Override
  public Z next() {
    while (true) {
      final Z s2 = mA.add(mB);
      final Z s3 = mC.add(mD).add(mE);
      final int c = s2.compareTo(s3);
      if (c <= 0) {
        mA = mB;
        mB = mU.next();
      }
      if (c >= 0) {
        mC = mD;
        mD = mE;
        mE = mV.next();
      }
      if (c == 0 && s2.isProbablePrime()) {
        return s2;
      }
    }
  }
}
