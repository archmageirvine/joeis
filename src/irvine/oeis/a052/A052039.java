package irvine.oeis.a052;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;

/**
 * A052039 a(n) is the smallest k such that the first significant digits of 1/k coincide with n.
 * @author Sean A. Irvine
 */
public class A052039 extends Sequence1 {

  private final LongDynamicArray<String> mA = new LongDynamicArray<>();
  {
    mA.set(0, "0");
    mA.set(1, "1");
  }
  private long mN = 0;

  private String get(final long k) {
    if (k >= mA.length()) {
      Q r = new Q(1, mA.length());
      while (true) {
        final Q t = r.multiply(10);
        if (!t.toZ().isZero()) {
          break;
        }
        r = t.subtract(t.toZ());
      }
      final StringBuilder sb = new StringBuilder();
      while (sb.length() < 20 && !Q.ZERO.equals(r)) {
        r = r.multiply(10);
        final Z t = r.toZ();
        sb.append(t);
        r = r.subtract(t);
      }
      mA.set(mA.length(), sb.toString());
    }
    return mA.get(k);
  }

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long k = 0;
    while (!get(++k).startsWith(s)) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
