package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025189 <code>a(n) = T(n,[ n/2 ])</code>, where T is the array defined in <code>A025177</code>.
 * @author Sean A. Irvine
 */
public class A025189 extends A025177 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
