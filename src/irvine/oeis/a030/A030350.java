package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030350.
 * @author Sean A. Irvine
 */
public class A030350 extends A030341 {

  private Z mSum = Z.ZERO;
  {
    super.next();
  }

  @Override
  public Z next() {
    final int t = super.next().intValue();
    if (t == 1) {
      mSum = mSum.add(1);
    } else if (t == 2) {
      mSum = mSum.subtract(1);
    }
    return mSum;
  }
}

