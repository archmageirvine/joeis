package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005132;

/**
 * A065038 Values of Recam\u00e1n's sequence A005132 at start of n-th segment (see A064492).
 * @author Sean A. Irvine
 */
public class A065038 extends Sequence1 {

  private final Sequence mRecaman = new A005132().skip();
  private Z mR = Z.NEG_ONE;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mN;
      mN = mN.add(1);
      final Z old = mR;
      final Z rec = mRecaman.next();
      mR = rec.mod(mN);
      if (old.multiply(mN).compareTo(mR.multiply(t)) < 0) {
        return rec;
      }
    }
  }
}
