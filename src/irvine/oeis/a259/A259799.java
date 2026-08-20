package irvine.oeis.a259;

import irvine.math.MemoryFunction3;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.triangle.DirectArray;

/**
 * A259799 Array read by antidiagonals upwards: T(n,k) = number of partitions of k^n into n-th powers (n&gt;=1, k&gt;=0).
 * @author Sean A. Irvine
 */
public class A259799 extends Sequence1 implements DirectArray {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = 0;
  protected final MemoryFunction3<Z, Z> mB = new MemoryFunction3<>() {
    @Override
    protected Z compute(final Z n, final Z i, final Z k) {
      if (n.isZero() || i.isOne()) {
        return Z.ONE;
      }
      final Z ik = i.pow(k);
      if (i.equals(Z.TWO)) {
        return Z.ONE.add(n.divide(ik));
      }
      final Z res = get(n, i.subtract(1), k);
      return n.compareTo(ik) < 0 ? res : res.add(get(n.subtract(ik), i, k));
    }
  };

  protected Z t(final int n, final long k) {
    return mB.get(Z.valueOf(k).pow(n), Z.valueOf(k), Z.valueOf(n));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }

  @Override
  public Z a(final long n, final long k) {
    return mB.get(Z.valueOf(k).pow(n), Z.valueOf(k), Z.valueOf(n));
  }

}
