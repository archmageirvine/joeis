package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003714.
 * @author Sean A. Irvine
 */
public class A003714 implements Sequence {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.valueOf(-2);
  private Z mC = Z.valueOf(-3);

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(1);
      mB = mB.add(2);
      mC = mC.add(3);
      if (Z.ZERO.equals(mA.xor(mB).xor(mC))) {
        return mA;
      }
    }
  }
}
