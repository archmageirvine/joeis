package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029942 Numbers k such that decimal expansion of k^3 contains k as a substring.
 * @author Sean A. Irvine
 */
public class A029942 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.pow(3).toString().contains(mN.toString())) {
        return mN;
      }
    }
  }
}
