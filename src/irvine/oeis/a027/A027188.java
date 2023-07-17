package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A027188 a(n) = number of partitions of n into an odd number of parts, the least being 2; also a(n+2) = number of partitions of n into an even number of parts, each &gt;=2.
 * @author Sean A. Irvine
 */
public class A027188 extends MemoryFunctionInt3Sequence<Z> {

  /** Construct the sequence. */
  public A027188() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A027188(final int offset) {
    super(offset);
  }

  // After Alois P. Heinz

  private int mN = start();

  protected int start() {
    return -3;
  }

  protected int leastPart() {
    return 2;
  }

  @Override
  protected Z compute(final int n, final int m, final int t) {
    if (n == 0) {
      return Z.valueOf(t);
    }
    if (m < leastPart()) {
      return Z.ZERO;
    }
    final Z r = get(n, m - 1, t);
    return m > n ? r : r.add(get(n - m, m, 1 - t));
  }

  @Override
  public Z next() {
    return get(++mN, mN, 1);
  }
}
