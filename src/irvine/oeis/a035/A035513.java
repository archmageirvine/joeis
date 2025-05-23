package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A035513 Wythoff array read by falling antidiagonals.
 * @author Sean A. Irvine
 */
public class A035513 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A035513() {
    super(1);
  }

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

