package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026901 <code>T(2n+1,n+4)</code>, T given by <code>A026780</code>.
 * @author Sean A. Irvine
 */
public class A026901 extends A026780 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 4);
  }
}
