package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024496 <code>a(n) = (3/(8n-4))*C(4n,n)</code>.
 * @author Sean A. Irvine
 */
public class A024496 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(4 * mN, mN).multiply(3).divide(8 * mN - 4);
  }
}
