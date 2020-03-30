package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002113;

/**
 * A030285.
 * @author Sean A. Irvine
 */
public class A030285 extends A002113 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final int syndrome = ZUtils.syn(mA);
    do {
      mA = super.next();
    } while ((ZUtils.syn(mA) & syndrome) != 0);
    return mA;
  }
}
