package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004390.
 * @author Sean A. Irvine
 */
public class A004390 implements Sequence {

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 9);
  }
}

