package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011847 Triangle of numbers read by rows: <code>T(n,k) = floor( C(n,k)/(k+1) ),</code> where <code>k=0..n-1</code> and <code>n &gt;= 1</code>.
 * @author Sean A. Irvine
 */
public class A011847 implements Sequence {

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

