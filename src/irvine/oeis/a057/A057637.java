package irvine.oeis.a057;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057637 a(n) is the largest number such that sigma(a(n)) = n, where sigma is the sum of divisors function (A000203).
 * @author Sean A. Irvine
 */
public class A057637 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z isigma = InverseSigma.maxInverseSigma(mN, 1);
    return isigma == null ? Z.ZERO : isigma;
  }
}
