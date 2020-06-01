package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026387 <code>a(n) =</code> number of integer strings <code>s(0),...,s(n)</code> counted by array T in <code>A026386</code> that have <code>s(n)=0;</code> also <code>a(n) = T(2n,n)</code>.
 * @author Sean A. Irvine
 */
public class A026387 extends A026386 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
