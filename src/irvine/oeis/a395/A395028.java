package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395028 allocated for Hoang Nguyen.
 * @author Sean A. Irvine
 */
public class A395028 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z a4 = mA.pow(4);
      do {
        mA = mA.add(1);
      } while (!a4.add(mA.pow(4)).isProbablePrime());
    }
    return mA;
  }
}
