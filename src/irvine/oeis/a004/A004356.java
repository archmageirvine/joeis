package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004356 Binomial coefficient C(6n,n-1).
 * @author Sean A. Irvine
 */
public class A004356 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(6 * ++mN, mN - 1);
  }
}

