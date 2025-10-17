package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081236 Greatest k&lt;n with mu(n-k)=mu(n)=mu(n+k), where mu=A008683 (Moebius function).
 * @author Sean A. Irvine
 */
public class A081236 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final int m = Functions.MOBIUS.i(++mN);
    long k = mN;
    while (Functions.MOBIUS.i(mN - --k) != m || Functions.MOBIUS.i(mN + k) != m) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
