package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027145 <code>T(2n,n)</code>, T given by <code>A027144</code>.
 * @author Sean A. Irvine
 */
public class A027145 extends A027144 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
