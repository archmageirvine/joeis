package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033880 Abundance of n, or (sum of divisors of n) - 2n.
 * @author Sean A. Irvine
 */
public class A033880 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma().subtract(2 * mN);
  }
}
