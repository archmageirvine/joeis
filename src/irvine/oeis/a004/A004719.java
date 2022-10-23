package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004719 Delete all 0's from n.
 * @author Sean A. Irvine
 */
public class A004719 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Z(mN.toString().replace("0", ""));
  }
}

