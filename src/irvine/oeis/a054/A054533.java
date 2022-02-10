package irvine.oeis.a054;

import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054533 Triangular array giving Ramanujan sum T(n,k) = c_n(k) = Sum_{m=1..n, (m,n)=1} exp(2 Pi i m k / n) for n &gt;= 1 and 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A054533 implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Integers.SINGLETON.sumdiv(IntegerUtils.gcd(mN, mM), d -> Z.valueOf((long) d * Mobius.mobius(mN / d)));
  }
}
