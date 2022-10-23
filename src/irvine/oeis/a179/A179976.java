package irvine.oeis.a179;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A179976 a(n) = 2^(2n+1) mod (2n+1).
 * @author Georg Fischer
 */
public class A179976 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(2 * mN + 1).mod(Z.valueOf(2 * mN + 1));
  }
}
