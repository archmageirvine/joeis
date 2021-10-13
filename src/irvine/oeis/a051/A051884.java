package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051884 Smallest number larger than the previous term which is not a prime but is relatively prime to the previous term.
 * @author Sean A. Irvine
 */
public class A051884 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z t = mA;
      do {
        mA = mA.add(1);
      } while (mA.isProbablePrime() || !Z.ONE.equals(t.gcd(mA)));
    }
    return mA;
  }
}
