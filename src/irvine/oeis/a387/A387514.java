package irvine.oeis.a387;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387514 allocated for Greg Dresden.
 * @author Sean A. Irvine
 */
public class A387514 extends Sequence1 {

  private int mN = 0;

  // a(n) = Sum_{i >= 0} binomial(n-2*i, 2i) * binomial(2i, i) + 2*binomial(n-2i-3, 2i+1) * binomial(2i+1,i).

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN / 2, k -> Binomial.binomial(mN - 2L * k, 2L * k).multiply(Binomial.binomial(2L * k, k))
      .add(mN - 2L * k - 3 < 0 ? Z.ZERO : Binomial.binomial(mN - 2L * k - 3, 2L * k + 1).multiply(Binomial.binomial(2L * k + 1, k)).multiply2()));
  }
}

