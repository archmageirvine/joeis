package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004338.
 * @author Sean A. Irvine
 */
public class A004338 implements Sequence {

  private long mN = 7;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 8);
  }
}

