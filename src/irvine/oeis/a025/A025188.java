package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025188 <code>a(n) = T(2n,n+1)</code>, where T is the array defined in <code>A025177</code>.
 * @author Sean A. Irvine
 */
public class A025188 extends A025177 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 1);
  }
}
