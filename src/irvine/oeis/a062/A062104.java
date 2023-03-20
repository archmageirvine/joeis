package irvine.oeis.a062;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062104 Square array read by antidiagonals: number of ways a black pawn (starting at any square on the second rank) can (theoretically) end at various squares on an infinite chessboard.
 * @author Sean A. Irvine
 */
public class A062104 extends Sequence0 {

  private int mN = 0;
  private int mM = 0;

  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int r, final int c) {
      if (r < 2 || c < 1) {
        return Z.ZERO;
      }
      if (r == 2) {
        return Z.ONE;
      }
      return get(r - 1, c - 1).add(get(r - 1, c)).add(get(r - 1, c + 1)).add(r == 4 ? 1 : 0);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mM, mN - mM + 1);
  }
}
