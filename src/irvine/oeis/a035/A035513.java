package irvine.oeis.a035;

import irvine.math.MemoryFunction2;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035513 Wythoff array read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A035513 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (k == -1) {
      return Z.valueOf(n - 1);
    }
    if (k == 0) {
      return CR.PHI.multiply(n).floor();
    }
    return get(n, k - 1).add(get(n, k - 2));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mM, mN - mM + 1);
  }
}

