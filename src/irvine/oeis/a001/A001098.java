package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001098 Multiply previous term by 2 and write in binary.
 * @author Sean A. Irvine
 */
public class A001098 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ONE;
    } else {
      mN = new Z(mN.multiply2().toString(2));
    }
    return mN;
  }
}

