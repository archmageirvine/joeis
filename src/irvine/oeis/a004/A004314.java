package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004314.
 * @author Sean A. Irvine
 */
public class A004314 implements Sequence {

  private long mN = 7;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 8);
  }
}

