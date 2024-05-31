package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060281 Triangle T(n,k) read by rows giving number of labeled mappings (or functional digraphs) from n points to themselves (endofunctions) with exactly k cycles, k=1..n.
 * @author Sean A. Irvine
 */
public class A060281 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Integers.SINGLETON.sum(0, mN - 1, k -> Binomial.binomial(mN - 1, k).multiply(Z.valueOf(mN).pow(mN - 1 - k)).multiply(Functions.STIRLING1.z(k + 1, mM).abs()));
  }
}
