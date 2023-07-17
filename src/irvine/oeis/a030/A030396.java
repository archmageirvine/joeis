package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030396 a(n)=(# 1's)-(# 0's) in first n terms of A030386.
 * @author Sean A. Irvine
 */
public class A030396 extends A030386 {

  /** Construct the sequence. */
  public A030396() {
    super(1);
  }

  private Z mSum = Z.ZERO;

  {
    super.next(); // skip 0th term that was added later to A030386
  }

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

