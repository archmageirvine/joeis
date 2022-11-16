package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030621 (# 4's)-(# 5's) in first n terms of A030604.
 * @author Sean A. Irvine
 */
public class A030621 extends A030604 {

  private Z mSum = Z.ZERO;
  {
    setOffset(1);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final int t = super.next().intValue();
    if (t == 4) {
      mSum = mSum.add(1);
    } else if (t == 5) {
      mSum = mSum.subtract(1);
    }
    return mSum;
  }
}

