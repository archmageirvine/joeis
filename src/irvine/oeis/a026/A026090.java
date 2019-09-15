package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026090 <code>a(n) = T(3n,n)</code>, where T is the array defined in <code>A026082</code>.
 * @author Sean A. Irvine
 */
public class A026090 extends A026082 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(3 * ++mN, mN);
  }
}

