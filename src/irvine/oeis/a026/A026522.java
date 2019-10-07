package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026522 <code>T(n,n-2)</code>, T given by <code>A026519</code>. Also number of integer strings <code>s(0),...,s(n)</code>, counted by T, such that <code>s(n)=2</code>.
 * @author Sean A. Irvine
 */
public class A026522 extends A026519 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
