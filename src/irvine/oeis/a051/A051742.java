package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051742 Associated with a chi-inequality greedy algorithm.
 * @author Sean A. Irvine
 */
public class A051742 extends A051741 {

  private long mA = super.next().longValueExact();
  private Z mM = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mA) {
      mA = super.next().longValueExact();
      mM = mM.add(1);
    }
    return mM;
  }
}

