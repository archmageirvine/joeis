package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085653 a(n) = smallest integer &gt; n where mu(n) = mu(a(n)).
 * @author Sean A. Irvine
 */
public class A085653 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final int mu = Functions.MOBIUS.i(++mN);
    long k = mN;
    while (Functions.MOBIUS.i(++k) != mu) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
