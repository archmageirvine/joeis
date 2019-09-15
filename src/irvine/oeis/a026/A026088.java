package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026088 <code>a(n) = T(2n-1,n)</code>, where T is the array defined in <code>A026082</code>.
 * @author Sean A. Irvine
 */
public class A026088 extends A026082 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN);
  }
}

