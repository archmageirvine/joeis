package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031143 Position of rightmost 0 (including leading 0) in 2^A031142(n).
 * @author Sean A. Irvine
 */
public class A031143 extends A031142 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mPrevBest);
  }
}

