package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A108154 a(n) = n^2 - n + 1 if prime else 0.
 * @author Georg Fischer
 */
public class A108154 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z result = Z.valueOf(mN).multiply(mN - 1).add(1);
    return result.isPrime() ? result : Z.ZERO;
  }
}
