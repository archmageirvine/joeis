package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030425.
 * @author Sean A. Irvine
 */
public class A030425 extends A030413 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final int t = super.next().intValue();
    if (t == 2) {
      mSum = mSum.add(1);
    } else if (t == 3) {
      mSum = mSum.subtract(1);
    }
    return mSum;
  }
}

