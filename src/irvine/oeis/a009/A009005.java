package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009005 All natural numbers except 1, 2 and 4.
 * @author Sean A. Irvine
 */
public class A009005 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.FOUR.equals(mN)) {
      mN = Z.FIVE;
    }
    return mN;
  }
}
