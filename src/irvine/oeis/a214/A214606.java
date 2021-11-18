package irvine.oeis.a214;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A214606 a(n) = gcd(n, 2^n - 2).
 * @author Georg Fischer
 */
public class A214606 implements Sequence {

  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).gcd(Z.ONE.shiftLeft(mN).subtract(2));
  }
}
