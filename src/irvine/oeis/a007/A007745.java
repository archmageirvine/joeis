package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007745 a(n) = n OR n^2 (applied to binary expansions).
 * @author Sean A. Irvine
 */
public class A007745 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().or(mN);
  }
}
