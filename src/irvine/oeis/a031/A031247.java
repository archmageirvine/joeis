package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031247 a(n)=(# 1's)-(# 0's) in first n terms of A031235.
 * @author Sean A. Irvine
 */
public class A031247 extends A031235 {

  /** Construct the sequence. */
  public A031247() {
    super(1);
  }

  {
    super.next();
  }

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

