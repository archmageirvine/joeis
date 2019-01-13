package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004340.
 * @author Sean A. Irvine
 */
public class A004340 implements Sequence {

  private long mN = 9;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 10);
  }
}

