package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060207 Start at 2^n, iterate function PrimePi (A000720) until fixed point is reached; sequence gives number of steps.
 * @author Sean A. Irvine
 */
public class A060207 extends Sequence0 {

  // Only good for a few terms

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    long cnt = 1;
    long t = mN.longValueExact();
    while (t != 0) {
      ++cnt;
      t = Functions.PRIME_PI.l(t);
    }
    return Z.valueOf(cnt);
  }
}
