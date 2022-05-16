package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001065 Sum of proper divisors (or aliquot parts) of n: sum of divisors of n that are less than n.
 * @author Sean A. Irvine
 */
public class A001065 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma().subtract(mN);
  }
}
