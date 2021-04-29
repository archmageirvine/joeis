package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046831 Digits of n^2 include digits of n as substring, n does not end in 0.
 * @author Sean A. Irvine
 */
public class A046831 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(10) != 0 && mN.square().toString().contains(mN.toString())) {
        return mN;
      }
    }
  }
}
