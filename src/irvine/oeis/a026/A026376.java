package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a002.A002212;

/**
 * A026376 <code>a(n)</code> is the number of integer strings <code>s(0),...,s(n)</code> counted by array T in <code>A026374</code> that have <code>s(n)=2</code>; also <code>a(n) = T(2n,n-1)</code>.
 * @author Sean A. Irvine
 */
public class A026376 extends A002212 {

  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
