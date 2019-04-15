package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004342 Binomial coefficient <code>C(4n, n-12)</code>.
 * @author Sean A. Irvine
 */
public class A004342 implements Sequence {

  private long mN = 11;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 12);
  }
}

