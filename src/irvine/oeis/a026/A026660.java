package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026660 <code>T(2n,n)</code>, T given by <code>A026659</code>.
 * @author Sean A. Irvine
 */
public class A026660 extends A026659 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
