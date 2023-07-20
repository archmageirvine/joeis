package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a244.A244160;

/**
 * A014418 Representation of n in base of Catalan numbers (a classic greedy version).
 * @author Sean A. Irvine
 */
public class A014418 extends MemorySequence {

  // After Indranil Ghosh

  private final A244160 mA = new A244160();
  private final A000108 mC = new A000108();
  private Z mPrev = Z.ZERO;
  private int mCatalan = mC.next().intValueExact();

  @Override
  protected Z computeNext() {
    final int n = size();
    final Z x = mA.next();
    if (n == 0) {
      return Z.ZERO;
    }
    if (!x.equals(mPrev)) {
      mPrev = x;
      mCatalan = mC.next().intValueExact();
    }
    return Z.TEN.pow(x.subtract(1)).add(a(n - mCatalan));
  }
}
