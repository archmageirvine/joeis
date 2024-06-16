package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059374 Triangle read by rows, T(n, k) = Sum_{i=0..n} L'(n, n-i) * binomial(i, k), for k = 0..n-1.
 * @author Sean A. Irvine
 */
public class A059374 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, mN, k -> Functions.LAH.z(mN, mN - k).abs().multiply(Binomial.binomial(k, mM)));
  }
}
