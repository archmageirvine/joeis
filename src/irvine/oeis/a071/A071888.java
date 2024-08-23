package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071888 a(1)=2 and for n&gt;1 a(n) = least squarefree m &gt; n with gcd(m,n)&gt;1.
 * @author Sean A. Irvine
 */
public class A071888 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    long m = mN;
    while (true) {
      if (Functions.GCD.l(++m, mN) > 1 && Predicates.SQUARE_FREE.is(m)) {
        return Z.valueOf(m);
      }
    }
  }
}
