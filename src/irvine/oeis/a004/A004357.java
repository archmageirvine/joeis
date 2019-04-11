package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004357 <code>a(n) =</code> binomial(6*n,n-2).
 * @author Sean A. Irvine
 */
public class A004357 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return Binomial.binomial(6 * ++mN, mN - 2);
  }
}

