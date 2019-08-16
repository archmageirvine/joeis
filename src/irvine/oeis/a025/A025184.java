package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025184 <code>a(n) = T(2n,n)</code>, where T is the array defined in <code>A025177</code>.
 * @author Sean A. Irvine
 */
public class A025184 extends A025177 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
