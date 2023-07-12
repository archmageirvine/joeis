package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A035529 A convolution triangle of numbers obtained from A034171.
 * @author Sean A. Irvine
 */
public class A035529 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A035529() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  protected long degree() {
    return 3;
  }

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || m > n) {
      return Z.ZERO;
    }
    if (n == 1) {
      return Z.ONE;
    }
    return get(n - 1, m).multiply(degree()).multiply(degree() * (n - 1) + m).add(get(n - 1, m - 1).multiply(m)).divide(n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}

