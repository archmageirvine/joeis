package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.math.Mobius;
import irvine.oeis.Sequence;

/**
 * A008683 M&#246;bius (or Moebius) function mu(n). mu(1) = 1; mu(n) = (-1)^k if n is the product of k different primes; otherwise mu(n) = 0.
 * @author Sean A. Irvine
 */
public class A008683 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Mobius.mobius(++mN));
  }
}
