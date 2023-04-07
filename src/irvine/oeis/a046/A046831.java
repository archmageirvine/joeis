package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046831 Numbers k such that decimal expansion of k^2 contains k as a substring and k does not end in 0.
 * @author Sean A. Irvine
 */
public class A046831 extends Sequence1 {

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
