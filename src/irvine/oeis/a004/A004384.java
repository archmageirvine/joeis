package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004384.
 * @author Sean A. Irvine
 */
public class A004384 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 3);
  }
}

