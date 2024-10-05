package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072106 All nontotients [even and odd] in reduced residue system of n.
 * @author Sean A. Irvine
 */
public class A072106 extends Sequence1 {

  private long mN = 0;

  protected long compute(final long n) {
    long cnt = 0;
    for (long k = 1; k < n; ++k) {
      if (Functions.GCD.l(n, k) == 1 && InverseEuler.inversePhi(Z.valueOf(k)).isEmpty()) {
        ++cnt;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    return Z.valueOf(compute(++mN));
  }
}
