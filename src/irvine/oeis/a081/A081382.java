package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081382 a(1) = 1, for n &gt; 1 a(n) = Min{x &gt; n, A008472(x) = A008472(n)}.
 * @author Sean A. Irvine
 */
public class A081382 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final long sopf = Functions.SOPF.l(mN);
    long k = mN;
    while (true) {
      if (Functions.SOPF.l(++k) == sopf) {
        return Z.valueOf(k);
      }
    }
  }
}

