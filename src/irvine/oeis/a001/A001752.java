package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001752.
 * @author Sean A. Irvine
 */
public class A001752 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z s = mN.square();
    return s.subtract(1).multiply(s.subtract(3)).divide(48);
  }
}
