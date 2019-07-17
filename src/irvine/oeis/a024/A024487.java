package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024487 <code>a(n) = (1/(4n+2))*M(3n; n,n,n)</code>.
 * @author Sean A. Irvine
 */
public class A024487 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.multinomial(3 * mN, mN, mN, mN).divide(4 * mN + 2);
  }
}
