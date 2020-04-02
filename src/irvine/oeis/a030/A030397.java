package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030397 <code>a(n)=(# 1's)-(# 2's)</code> in first n terms of <code>A030386</code>.
 * @author Sean A. Irvine
 */
public class A030397 extends A030386 {

  private Z mSum = Z.ZERO;
  {
    super.next(); // skip 0th term that was added later to A030386
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

