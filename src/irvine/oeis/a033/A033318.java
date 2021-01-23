package irvine.oeis.a033;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;
import irvine.util.array.LongDynamicLongArray;

/**
 * A033318 Least D in the Pellian x^2 - D*y^2 = 1 for which y has least solution n.
 * @author Sean A. Irvine
 */
public class A033318 extends A000037 {

  private static final long LIMIT = 10000000; // Stops very large results from being stored
  private static final Z Z_LIMIT = Z.valueOf(LIMIT);
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN >= LIMIT) {
      throw new UnsupportedOperationException();
    }
    while (mA.get(mN) == 0) {
      final Z d = super.next();
      final Q conv = A033313.solvePell(d);
      if (conv.den().compareTo(Z_LIMIT) < 0) {
        final long y = conv.den().longValueExact();
        if (mA.get(y) == 0) {
          mA.set(y, d.longValueExact());
        }
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}

