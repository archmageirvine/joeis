package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059364 Triangle T(n,k)=Sum_{i=0..n} |stirling1(n,n-i)|*binomial(i,k), k=0..n-1.
 * @author Sean A. Irvine
 */
public class A059364 implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, mN, k -> Stirling.firstKind(mN, mN - k).abs().multiply(Binomial.binomial(k, mM)));
  }
}
