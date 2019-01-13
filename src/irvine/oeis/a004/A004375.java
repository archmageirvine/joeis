package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004375.
 * @author Sean A. Irvine
 */
public class A004375 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN - 7);
  }
}

