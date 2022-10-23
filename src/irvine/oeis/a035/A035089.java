package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035089 Smallest prime of form 2^n*k + 1.
 * @author Sean A. Irvine
 */
public class A035089 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      final Z t = k.shiftLeft(mN).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
