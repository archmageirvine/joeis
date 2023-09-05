package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A090205 a(n) = n^n * (n+1)^(n+1).
 * @author Georg Fischer
 */
public class A090205 extends Sequence0 {

  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN).multiply(Z.valueOf(mN + 1).pow(mN + 1));
  }
}
