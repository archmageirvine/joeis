package irvine.oeis.a079;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A079122 Number of ways to partition 2*n into distinct positive integers not greater than n.
 * @author Sean A. Irvine
 */
public class A079122 extends AbstractSequence {

  // After Alois P. Heinz

  private int mN = -1;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return Z.ONE;
      }
      if (m < 1) {
        return Z.ZERO;
      }
      final Z b = get(n, m - 1);
      return m > n ? b : b.add(get(n - m, m - 1));
    }
  };

  protected A079122(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A079122() {
    this(0);
  }

  @Override
  public Z next() {
    return mB.get(2 * ++mN, mN);
  }
}

