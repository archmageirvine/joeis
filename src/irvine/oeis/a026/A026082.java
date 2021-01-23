package irvine.oeis.a026;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026082 Irregular triangular array T read by rows: T(n,k) = C(n,k) for k=0..n for n = 0,1,2,3. For n &gt;= 4, T(n,0) = T(n,2n)=1, T(n,1) = T(n,2n-1) = n - 3, T(4,2) = 4, T(4,3) = 3, T(4,4) = 6; T(4,5) = 3, T(4,6)=4; for n &gt;= 5, T(n,k) = T(n-1,k-2) + T(n-1,k-1) + T(n-1,k) for k=2..2n-2.
 * @author Sean A. Irvine
 */
public class A026082 extends MemoryFunction2<Long, Z> implements Sequence {

  private static final Z[] N4 = {Z.ONE, Z.ONE, Z.FOUR, Z.THREE, Z.SIX, Z.THREE, Z.FOUR, Z.ONE, Z.ONE};
  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n < 0 || m < 0 || m > 2 * n) {
      return Z.ZERO;
    } else if (n <= 3) {
      return Binomial.binomial(n, m);
    } else if (n == 4) {
      return N4[m.intValue()];
    } else if (m == 0 || m == 2 * n) {
      return Z.ONE;
    } else {
      return get(n - 1, m - 2).add(get(n - 1, m - 1)).add(get(n - 1, m));
    }
  }

  @Override
  public Z next() {
    do {
      if (++mM > 2 * mN) {
        ++mN;
        mM = 0;
      }
    } while (get(mN, mM).isZero());
    return get(mN, mM);
  }
}

