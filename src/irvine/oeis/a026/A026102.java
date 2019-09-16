package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026102 <code>a(n) = T(2n-1,n)</code>, where T is the array in <code>A026098</code>.
 * @author Sean A. Irvine
 */
public class A026102 extends A026098 {

  private long mS = -4;

  @Override
  public Z next() {
    mS += 4;
    for (long k = 1; k < mS; ++k) {
      super.next();
    }
    return super.next();
  }
}
