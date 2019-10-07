package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026570 <code>a(n)=T(n,n-1)</code>, T given by <code>A026568</code>. Also <code>a(n) =</code> number of integer strings <code>s(0),...,s(n)</code> counted by T such that <code>s(n)=1</code>.
 * @author Sean A. Irvine
 */
public class A026570 extends A026568 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
