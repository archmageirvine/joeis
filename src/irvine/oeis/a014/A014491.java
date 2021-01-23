package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014491 a(n) = gcd(n, 2^n - 1).
 * @author Sean A. Irvine
 */
public class A014491 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(1).gcd(Z.valueOf(mN));
  }
}
