package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000590 <code>a(n) =</code> 13*binomial(2n,n-6)/(n+7).
 * @author Sean A. Irvine
 */
public class A000590 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN - 6).multiply(13).divide(mN + 7);
  }
}

