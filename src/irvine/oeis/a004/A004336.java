package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004336.
 * @author Sean A. Irvine
 */
public class A004336 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 6);
  }
}

