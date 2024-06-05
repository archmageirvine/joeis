package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059340 Triangle T(n,k) of numbers with e.g.f. exp((exp((1+x)*y)-1)/(1+x)), k=0..n-1.
 * @author Sean A. Irvine
 */
public class A059340 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, mN, k -> Functions.STIRLING2.z(mN, k).multiply(Binomial.binomial(mN - k, mM)));
  }
}
