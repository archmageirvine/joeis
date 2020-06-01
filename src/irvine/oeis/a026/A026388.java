package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026388 <code>a(n) =</code> number of integer strings <code>s(0),...,s(n)</code> counted by array T in <code>A026386</code> that have <code>s(n)=2;</code> also <code>a(n) = T(2n,n-1)</code>.
 * @author Sean A. Irvine
 */
public class A026388 extends A026386 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
