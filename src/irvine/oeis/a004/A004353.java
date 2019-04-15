package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004353 Binomial coefficient <code>C(5n,n-11)</code>.
 * @author Sean A. Irvine
 */
public class A004353 implements Sequence {

  private long mN = 10;

  @Override
  public Z next() {
    return Binomial.binomial(5 * ++mN, mN - 11);
  }
}

