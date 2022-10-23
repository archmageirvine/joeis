package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065440 a(n) = (n-1)^n.
 * @author Georg Fischer
 */
public class A065440 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Z.valueOf(mN - 1).pow(mN);
  }
}
