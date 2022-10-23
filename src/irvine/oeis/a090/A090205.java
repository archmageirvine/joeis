package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A090205 n^n * (n+1)^(n+1).
 * @author Georg Fischer
 */
public class A090205 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN).multiply(Z.valueOf(mN + 1).pow(mN + 1));
  }
}
