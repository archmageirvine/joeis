package irvine.oeis.a028;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028246 Triangular array <code>a(n,k) = (1/k)*Sum_{i=0..k} (-1)^(k-i)*binomial(k,i)*i^n; n &gt;= 1, 1 &lt;= k &lt;=</code> n, read by rows.
 * @author Sean A. Irvine
 */
public class A028246 implements Sequence {

  private long mN = 0;
  private long mK = 0;
  private Z mFactorialK = Z.ONE;

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 1;
      mFactorialK = Z.ONE;
    }
    final Z f = mFactorialK;
    mFactorialK = mFactorialK.multiply(mK);
    return f.multiply(Stirling.secondKind(mN, mK));
  }
}
