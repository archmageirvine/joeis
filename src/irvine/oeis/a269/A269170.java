package irvine.oeis.a269;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A269170 a(n) = n OR floor(n/2), where OR is bitwise-OR (A003986).
 * @author Georg Fischer
 */
public class A269170 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).or(Z.valueOf(mN >> 1));
  }
}
