package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024491 <code>a(n) = (1/(4n-1))*C(4n,2n)</code>.
 * @author Sean A. Irvine
 */
public class A024491 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(4 * mN, 2 * mN).divide(4 * mN - 1);
  }
}
