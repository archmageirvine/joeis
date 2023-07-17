package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030350 a(n) = (# 1's)-(# 2's) in first n terms of A030341.
 * @author Sean A. Irvine
 */
public class A030350 extends A030341 {

  /** Construct the sequence. */
  public A030350() {
    super(1);
  }

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

