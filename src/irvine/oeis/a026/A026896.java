package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026896 <code>T(2n,n+3)</code>, T given by <code>A026780</code>.
 * @author Sean A. Irvine
 */
public class A026896 extends A026780 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 3);
  }
}
