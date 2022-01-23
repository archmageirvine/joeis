package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055869 a(n) = (n+1)^n - n^n.
 * @author Georg Fischer
 */
public class A055869 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN + 1).pow(mN).subtract(Z.valueOf(mN).pow(mN));
  }
}
