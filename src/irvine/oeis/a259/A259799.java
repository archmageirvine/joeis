package irvine.oeis.a259;

import irvine.math.MemoryFunction3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A259799.
 * @author Sean A. Irvine
 */
public class A259799 extends MemoryFunction3<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Long n, final Long i, final Long k) {
    if (n == 0 || i == 1) {
      return Z.ONE;
    }
    final long ik = Z.valueOf(i).pow(k.intValue()).longValueExact();
    if (i == 2) {
      return Z.ONE.add(n / ik);
    }
    final Z res = get(n, i - 1, k);
    return ik > n ? res : res.add(get(n - ik, i, k));
  }

  protected Z t(final int n, final long k) {
    return get(Z.valueOf(k).pow(n).longValueExact(), k, (long) n);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
