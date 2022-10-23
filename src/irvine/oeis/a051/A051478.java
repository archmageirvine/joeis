package irvine.oeis.a051;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051478 a(n) is the number of values k satisfying phi(k) = 4*n+2, n&gt;0.
 * @author Sean A. Irvine
 */
public class A051478 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    mN += 4;
    return Z.valueOf(Euler.inversePhi(Z.valueOf(mN)).size());
  }
}
