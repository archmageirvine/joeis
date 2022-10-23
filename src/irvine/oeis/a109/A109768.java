package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A109768 a(n) = gcd(3^n-2,2^n-3).
 * @author Georg Fischer
 */
public class A109768 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.THREE.pow(mN).subtract(2).gcd(Z.ONE.shiftLeft(mN).subtract(3));
  }
}
