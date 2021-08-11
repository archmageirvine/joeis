package irvine.oeis.a050;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050227 Triangle of number of n-tosses having a run of r or more heads for a fair coin with r=1 to n across and n=1, 2, ... down.
 * @author Sean A. Irvine
 */
public class A050227 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Z.ONE;
    }
    if (m > n) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int k = n - m; k < n; ++k) {
      sum = sum.add(get(k, m));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.ONE.shiftLeft(mN).subtract(get(mN + mM + 1, mM));
  }
}
