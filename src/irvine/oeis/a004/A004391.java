package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004391.
 * @author Sean A. Irvine
 */
public class A004391 implements Sequence {

  private long mN = 9;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 10);
  }
}

