package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;

/**
 * A063865 Number of solutions to <code>+- 1 +- 2 +- 3 +-</code> ... <code>+- n = 0</code>.
 * @author Sean A. Irvine
 */
public class A063865 implements Sequence {

  private DynamicArray<Z> mA = new DynamicArray<>();
  private int mN = -1;

  private Z get(final DynamicArray<Z> a, final int p) {
    final Z v = a.get(p);
    return v == null ? Z.ZERO : v;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.set(0, Z.ONE);
      return Z.ONE;
    }
    final DynamicArray<Z> a = new DynamicArray<>();
    for (int k = 0; k < mA.length(); ++k) {
      final Z c = mA.get(k);
      if (c != null) {
        final int tp = k + mN;
        a.set(tp, get(a, tp).add(c));
        final int tm = k - mN;
        if (tm >= 0) {
          a.set(tm, get(a, tm).add(c));
        }
        if (k != 0) {
          final int ts = mN - k;
          if (ts >= 0) {
            a.set(ts, get(a, ts).add(c));
          }
        }
      }
    }
    mA = a;
    return get(mA, 0);
  }
}
