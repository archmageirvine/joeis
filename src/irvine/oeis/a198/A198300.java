package irvine.oeis.a198;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A198300 Square array M(k,g), read by antidiagonals, of the Moore lower bound on the order of a (k,g)-cage.
 * @author Sean A. Irvine
 */
public class A198300 extends MemoryFunction2Sequence<Integer, Z> {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A198300(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A198300() {
    super(1);
  }

  protected int mN = 0;
  protected int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m == 3) {
      return Z.valueOf(n + 1);
    }
    return get(n, m - 1).add(Z.valueOf(n - 1).pow((m - 1) / 2));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return get(mN + 1 - mM, mM + 3);
  }
}
