package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011847 Triangle of numbers read by rows: T(n,k) = floor( C(n,k)/(k+1) ), where k=0..n-1 and n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A011847 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM).divide(mM + 1);
  }
}

