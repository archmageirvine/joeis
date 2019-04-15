package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004365 Binomial coefficient <code>C(6n,n-10)</code>.
 * @author Sean A. Irvine
 */
public class A004365 implements Sequence {

  private long mN = 9;

  @Override
  public Z next() {
    return Binomial.binomial(6 * ++mN, mN - 10);
  }
}

