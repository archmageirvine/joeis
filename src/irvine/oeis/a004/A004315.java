package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004315 <code>a(n) =</code> binomial coefficient <code>C(2n, n-9)</code>.
 * @author Sean A. Irvine
 */
public class A004315 implements Sequence {

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 9);
  }
}

