package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070218.
 * @author Sean A. Irvine
 */
public class A070232 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.FOUR;
      return Z.FOUR;
    } else {
      Z res = mA;
      do {
        res = res.add(1);
      } while (res.isProbablePrime());
      mA = mA.add(res);
      return res;
    }
  }
}

