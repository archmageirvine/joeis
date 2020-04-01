package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030383.
 * @author Sean A. Irvine
 */
public class A030383 extends A030373 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final int t = super.next().intValue();
    if (t == 1) {
      mSum = mSum.add(1);
    } else if (t == 0) {
      mSum = mSum.subtract(1);
    }
    return mSum;
  }
}

