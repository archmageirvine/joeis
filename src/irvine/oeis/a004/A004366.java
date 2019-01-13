package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004366.
 * @author Sean A. Irvine
 */
public class A004366 implements Sequence {

  private long mN = 10;

  @Override
  public Z next() {
    return Binomial.binomial(6 * ++mN, mN - 11);
  }
}

