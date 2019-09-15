package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026091 <code>a(n) = T(4n,n)</code>, where T is the array defined in <code>A026082</code>.
 * @author Sean A. Irvine
 */
public class A026091 extends A026082 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(4 * ++mN, mN);
  }
}

