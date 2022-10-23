package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029943 Substring of both its square and its cube.
 * @author Sean A. Irvine
 */
public class A029943 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.toString();
      if (mN.pow(3).toString().contains(s) && mN.square().toString().contains(s)) {
        return mN;
      }
    }
  }
}
