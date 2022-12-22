package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082494 a(n) = n - (2^n (mod n)).
 * @author Georg Fischer
 */
public class A082494 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(mN);
    return n.subtract(Z.ONE.shiftLeft(mN).mod(n));
  }
}
