package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A108151 a(n) = n^2 + 3*n + 1 if prime or 0 if composite.
 * @author Georg Fischer
 */
public class A108151 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z result = Z.valueOf(mN).multiply(mN + 3).add(1);
    return result.isPrime() ? result : Z.ZERO;
  }
}
