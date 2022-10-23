package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004632 Cubes written in base 2.
 * @author Sean A. Irvine
 */
public class A004632 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Z(mN.pow(3).toString(2));
  }
}

