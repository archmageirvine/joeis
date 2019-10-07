package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026573 <code>a(n)=T(n,n-4)</code>, T given by <code>A026568</code>. Also <code>a(n) =</code> number of integer strings <code>s(0),...,s(n)</code> counted by T, such that <code>s(n)=4</code>.
 * @author Sean A. Irvine
 */
public class A026573 extends A026568 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, mN - 4);
  }
}
