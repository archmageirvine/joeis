package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004315 a(n) = binomial coefficient C(2n, n-9).
 * @author Sean A. Irvine
 */
public class A004315 implements Sequence {

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 9);
  }
}

