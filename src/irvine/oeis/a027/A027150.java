package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027150 <code>T(n,[ n/2 ])</code>, T given by <code>A027144</code>.
 * @author Sean A. Irvine
 */
public class A027150 extends A027144 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
