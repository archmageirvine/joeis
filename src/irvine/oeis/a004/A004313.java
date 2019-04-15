package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004313 <code>a(n) =</code> binomial coefficient <code>C(2n, n-7)</code>.
 * @author Sean A. Irvine
 */
public class A004313 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 7);
  }
}

