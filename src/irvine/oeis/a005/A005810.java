package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005810 <code>a(n) = binomial(4n,n)</code>.
 * @author Sean A. Irvine
 */
public class A005810 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(4 * mN, mN);
  }
}
