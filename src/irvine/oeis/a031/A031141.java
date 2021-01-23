package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031141 Position of rightmost digit 0 in 2^A031140(n).
 * @author Sean A. Irvine
 */
public class A031141 extends A031140 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mPrevBest);
  }
}

