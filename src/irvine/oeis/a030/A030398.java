package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030398.
 * @author Sean A. Irvine
 */
public class A030398 extends A030386 {

  private Z mSum = Z.ZERO;
  {
    super.next(); // skip 0th term that was added later to A030386
  }

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

