package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076746 List giving pairs of primes of the form 10k+3 and 10k+7.
 * @author Sean A. Irvine
 */
public class A076746 extends Sequence1 {

  private Z mB = null;
  private Z mN = Z.valueOf(-7);

  @Override
  public Z next() {
    if (mB != null) {
      final Z t = mB;
      mB = null;
      return t;
    }
    while (true) {
      mN = mN.add(10);
      if (mN.isProbablePrime() && mN.add(4).isProbablePrime()) {
        mB = mN.add(4);
        return mN;
      }
    }
  }
}
