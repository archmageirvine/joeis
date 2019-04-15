package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004337 Binomial coefficient <code>C(4n,n-7)</code>.
 * @author Sean A. Irvine
 */
public class A004337 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 7);
  }
}

