package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004361 Binomial coefficient <code>C(6n,n-6)</code>.
 * @author Sean A. Irvine
 */
public class A004361 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(6 * ++mN, mN - 6);
  }
}

