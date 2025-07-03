package irvine.oeis.a078;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078489 a(n)=j such that binomial(n,j)&lt;binomial(n-1,j-2).
 * @author Sean A. Irvine
 */
public class A078489 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long j = 0;
    while (Binomial.binomial(mN, j).compareTo(Binomial.binomial(mN - 1, j - 2)) > 0) {
      ++j;
    }
    return Z.valueOf(j);
  }
}

