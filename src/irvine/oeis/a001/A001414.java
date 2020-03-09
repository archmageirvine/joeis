package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001414 Integer log of n: sum of primes dividing <code>n</code> (with repetition). Also called <code>sopfr(n)</code>.
 * @author Sean A. Irvine
 */
public class A001414 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sopfr();
  }
}
