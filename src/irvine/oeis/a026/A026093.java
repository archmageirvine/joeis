package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026093 <code>T(2n,n+1)</code>, where T is the array defined in <code>A026082</code>.
 * @author Sean A. Irvine
 */
public class A026093 extends A026082 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 1);
  }
}

