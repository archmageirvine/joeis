package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001450 <code>a(n) = binomial(5*n,2*n)</code>.
 * @author Sean A. Irvine
 */
public class A001450 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(5 * mN, 2 * mN);
  }
}
