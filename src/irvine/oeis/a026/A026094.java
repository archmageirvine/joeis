package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026094 <code>a(n) = T(n,[ n/2 ])</code>, where T is the array defined in <code>A026082</code>.
 * @author Sean A. Irvine
 */
public class A026094 extends A026082 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}

