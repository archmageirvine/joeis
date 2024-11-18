package irvine.oeis.a073;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000670;

/**
 * A073146 Triangle of numbers {a(n,k), n &gt;= 0, 0 &lt;= k &lt;= n} defined by a(0,0)=1, a(n,0)=A000670(n), a(n,n)=A000629(n), a(n,k) = a(n,k-1) + a(n-1,k-1); a(n+1,0) = Sum_{k=0..n} a(n,k).
 * @author Sean A. Irvine
 */
public class A073146 extends Sequence0 {

  private final DirectSequence mA = new A000670();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(mN - mM, mN, k -> Binomial.binomial(mM, k - mN + mM).multiply(mA.a(k)));
  }
}

