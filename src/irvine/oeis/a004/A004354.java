package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004354.
 * @author Sean A. Irvine
 */
public class A004354 implements Sequence {

  private long mN = 11;

  @Override
  public Z next() {
    return Binomial.binomial(5 * ++mN, mN - 12);
  }
}

