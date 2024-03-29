package irvine.oeis.a336;
// Generated by gen_seq4.pl build/simple at 2022-06-14 21:39

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A336539 G.f. A(x) satisfies A(x) = 1 + x * A(x)^3 * (1 + 2 * A(x)).
 * @author Georg Fischer
 */
public class A336539 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN, k -> Z.ONE.shiftLeft(mN - k).multiply(Binomial.binomial(3L * mN + 1, k)).multiply(Binomial.binomial(4L * mN - k, mN - k)).divide(3L * mN + 1));
  }
}
