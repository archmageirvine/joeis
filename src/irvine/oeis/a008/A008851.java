package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008851 Congruent to 0 or 1 mod 5.
 * @author Sean A. Irvine
 */
public class A008851 implements Sequence {

  private Z mN = Z.valueOf(-4);
  private long mAdd = 4;

  @Override
  public Z next() {
    mN = mN.add(mAdd);
    mAdd = 5 - mAdd;
    return mN;
  }
}
