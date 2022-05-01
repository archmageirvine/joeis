package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056636.
 * @author Sean A. Irvine
 */
public class A056650 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      final Z[] p = Jaguar.factor(mA.square().add(mA).add(1)).toZArray();
      mA = p[p.length - 1];
    }
    return mA;
  }
}
