package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004316 <code>a(n) =</code> binomial coefficient <code>C(2n, n-10)</code>.
 * @author Sean A. Irvine
 */
public class A004316 implements Sequence {

  private long mN = 9;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 10);
  }
}

