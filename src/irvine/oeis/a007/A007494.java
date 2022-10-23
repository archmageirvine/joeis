package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007494 Numbers that are congruent to 0 or 2 mod 3.
 * @author Sean A. Irvine
 */
public class A007494 extends Sequence0 {

  private long mN = -1;
  private long mAdd = 1;

  @Override
  public Z next() {
    mN += mAdd;
    mAdd = 3 - mAdd;
    return Z.valueOf(mN);
  }
}
