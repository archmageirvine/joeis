package irvine.oeis.a111;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A111972 a(n) = Max(omega(k): 1&lt;=k&lt;=n), where omega(n) = A001221(n), the number of distinct prime factors of n.
 * @author Sean A. Irvine
 */
public class A111972 extends Sequence1 {

  private Z mMax = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mMax = mMax.max(Functions.OMEGA.z(++mN));
    return mMax;
  }
}
