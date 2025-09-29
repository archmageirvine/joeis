package irvine.oeis.a388;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A388258 Number of divisors d of n such that d^d == -(-d)^n (mod n).
 * @author Sean A. Irvine
 */
public class A388258 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    final Z n = Z.valueOf(++mN);
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (d.modPow(d, n).equals(n.subtract(d.negate().modPow(n, n)).mod(n))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
