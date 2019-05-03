package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000005 <code>d(n)</code> (also called <code>tau(n)</code> or <code>sigma_0(n))</code>, the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A000005 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma0();
  }
}

