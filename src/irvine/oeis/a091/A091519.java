package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A091519 G.f.: Sum_{k&gt;=0} (2^k*t*(1+t)/(1-t)^3, t=x^2^k).
 * a(n)=2*n*n-n*n/2^valuation(n, 2).
 * @author Georg Fischer
 */
public class A091519 extends Sequence1 {

  private long mN;

  /** Construct the sequence. */
  public A091519() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    final long n2 = mN * mN;
    return Z.valueOf(2 * n2 - n2 / (1L << ZUtils.valuation(Z.valueOf(mN), Z.TWO)));
  }
}
