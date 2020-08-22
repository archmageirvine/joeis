package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000203 a(n) = sigma(n), the sum of the divisors of n. Also called sigma_1(n).
 * @author Sean A. Irvine
 */
public class A000203 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma();
  }
}
