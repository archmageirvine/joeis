package irvine.oeis.a137;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A137695 Tower of Hanoi with p pegs: A(p,n) = number of moves needed for n disks, using Frame's or Stewart's algorithm, read by columns of the upper right triangle of rows p &gt;= 3, columns n &gt;= p-2.
 * @author Sean A. Irvine
 */
public class A137695 extends Sequence1 {

  private int mN = 1;
  private int mM = 2;

  private long s(final long n, final long p) {
    long k = 0;
    while (n > Binomial.binomial(p - 3 + k, p - 2).longValueExact()) {
      ++k;
    }
    return k - 1;
  }

  protected Z t(final long n, final long p) {
    final long s = s(n, p);
    return Integers.SINGLETON.sum(0, s - 1, t -> Binomial.binomial(p - 3 + t, p - 3).shiftLeft(t))
      .add(Z.valueOf(n).subtract(Binomial.binomial(p - 3 + s, p - 2)).shiftLeft(s));
  }

  @Override
  public Z next() {
    if (++mM > mN + 2) {
      ++mN;
      mM = 3;
    }
    return t(mN, mM);
  }
}
