package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083753 Smallest palindromic number with exactly n divisors, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083753 extends Sequence1 implements Conjectural {

  private static final int MAX = 1000;
  private final Sequence mPalins = new A002113().skip();
  private final Z[] mFirsts = new Z[MAX];
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN >= MAX) {
      throw new UnsupportedOperationException();
    }
    while (mFirsts[mN] == null) {
      final Z p = mPalins.next();
      final Z sigma0 = Functions.SIGMA0.z(p);
      if (sigma0.bitLength() < Integer.SIZE) {
        final int s0 = sigma0.intValue();
        if (s0 < MAX && mFirsts[s0] == null) {
          mFirsts[s0] = p;
          if (s0 < mN) {
            throw new RuntimeException("Heuristic failed: a(" + s0 + ") should have been " + p);
          }
        }
      }
      // Heuristic
      if (p.bitLength() > 3 * mN) {
        return Z.ZERO;
      }
    }
    return mFirsts[mN];
  }
}
