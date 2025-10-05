package irvine.oeis.a080;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A080934 Square array read by antidiagonals of number of Catalan paths (nonnegative, starting and ending at 0, step +/-1) of 2n steps with all values less than or equal to k.
 * @author Sean A. Irvine
 */
public class A080934 extends AbstractSequence {

  // After Alois P. Heinz

  public A080934(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A080934() {
    this(0);
  }

  private int mN = 0;
  private int mM = -1;
  protected final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int x, final int y, final int m) {
      if (y < 0 || y > Math.min(m, x)) {
        return Z.ZERO;
      }
      if (x == 0) {
        return Z.ONE;
      }
      return get(x - 1, y - 1, m).add(get(x - 1, y + 1, m));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(2 * mM, 0, mN - mM);
  }
}

