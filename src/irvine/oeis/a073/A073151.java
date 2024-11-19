package irvine.oeis.a073;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a006.A006319;

/**
 * A073151 Triangle of numbers {a(n,k), n &gt;= 0, 0&lt;=k&lt;=n} defined by a(0,0)=1, a(n+1,0)=A006319(n)=a(n,0) + Sum a(k,k), k=0..n-1. a(n,m+1)= a(n,0) + Sum A006319(k)*a(n-k-1,0), k=0..m-1.
 * @author Sean A. Irvine
 */
public class A073151 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private final DirectSequence mA = DirectSequence.create(new A006319());
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n < 0) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      if (m == 0) {
        return mA.a(n);
      }
      return Integers.SINGLETON.sum(0, m, k -> mA.a(k).multiply(get(n - k, 0)));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
