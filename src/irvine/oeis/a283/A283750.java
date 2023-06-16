package irvine.oeis.a283;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A283750 a(n) = n^2 XOR (n + 1)^2.
 * @author Georg Fischer
 */
public class A283750 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).square().xor(Z.valueOf(mN + 1).square());
  }
}
