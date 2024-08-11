package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004640 Cubes written in base 11. (Next term contains a non-decimal character.).
 * @author Sean A. Irvine
 */
public class A004640 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Z(mN.pow(3).toString(11));
  }
}

