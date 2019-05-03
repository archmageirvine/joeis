package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008836 Liouville's function <code>lambda(n) = (-1)^k</code>, where k is number of primes dividing <code>n (counted</code> with <code>multiplicity)</code>.
 * @author Sean A. Irvine
 */
public class A008836 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(++mN).lambda());
  }
}

