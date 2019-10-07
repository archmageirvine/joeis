package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026523 <code>a(n) = T(n,n-3)</code>, T given by <code>A026519</code>. Also <code>a(n) =</code> number of integer strings <code>s(0),...,s(n)</code>, counted by T, such that <code>s(n)=3</code>.
 * @author Sean A. Irvine
 */
public class A026523 extends A026519 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
