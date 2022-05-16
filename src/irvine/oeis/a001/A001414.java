package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001414 Integer log of n: sum of primes dividing n (with repetition). Also called sopfr(n).
 * @author Sean A. Irvine
 */
public class A001414 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sopfr();
  }
}
