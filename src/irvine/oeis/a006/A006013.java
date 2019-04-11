package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006013 <code>a(n) =</code> binomial(3*n+1,n)/(n+1).
 * @author Sean A. Irvine
 */
public class A006013 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(3 * mN + 1, mN).divide(mN + 1);
  }
}

