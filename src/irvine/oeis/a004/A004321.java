package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004321 Binomial coefficient C(3n, <code>n-3)</code>.
 * @author Sean A. Irvine
 */
public class A004321 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN - 3);
  }
}

