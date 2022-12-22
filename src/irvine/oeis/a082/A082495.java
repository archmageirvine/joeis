package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082495 a(n) = (2^n - 1) mod n.
 * @author Georg Fischer
 */
public class A082495 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).subtract(1).mod(Z.valueOf(mN));
  }
}
