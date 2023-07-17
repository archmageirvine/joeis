package irvine.oeis.a033;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;
import irvine.util.array.LongDynamicLongArray;

/**
 * A033314 Least D in the Pellian x^2 - D*y^2 = 1 for which x has least solution n.
 * @author Sean A. Irvine
 */
public class A033314 extends A000037 {

  /** Construct the sequence. */
  public A033314() {
    super(2);
  }

  private static final long LIMIT = 10000000; // Stops very large results from being stored
  private static final Z Z_LIMIT = Z.valueOf(LIMIT);
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = 1;

  @Override
  public Z next() {
    if (++mN >= LIMIT) {
      throw new UnsupportedOperationException();
    }
    while (mA.get(mN) == 0) {
      final Z d = super.next();
      final Q conv = A033313.solvePell(d);
      if (conv.num().compareTo(Z_LIMIT) < 0) {
        final long x = conv.num().longValueExact();
        if (mA.get(x) == 0) {
          mA.set(x, d.longValueExact());
        }
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}

