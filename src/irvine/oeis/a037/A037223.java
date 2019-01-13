package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a000.A000165;

/**
 * A037223.
 * @author Sean A. Irvine
 */
public class A037223 extends A000165 {

  private Z mT = null;

  @Override
  public Z next() {
    if (mT == null) {
      mT = super.next();
      return mT;
    } else {
      final Z t = mT;
      mT = null;
      return t;
    }
  }
}
