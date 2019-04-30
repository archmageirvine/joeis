package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a001.A001950;
import irvine.util.array.LongDynamicLongArray;

/**
 * A002251 Start with sequence of nonnegative integers; then swap <code>L(k)</code> and <code>U(k)</code> for all <code>k &gt;= 1</code>, where L = A000201, U = A001950 (lower and upper Wythoff sequences).
 * @author Sean A. Irvine
 */
public class A002251 implements Sequence {

  private final A000201 mL = new A000201();
  private final A001950 mU = new A001950();
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = -1;

  private void ensure(final long x) {
    while (mA.length() <= x) {
      mA.set(mA.length(), mA.length());
    }
  }

  @Override
  public Z next() {
    ensure(++mN);
    final long l = mL.next().longValueExact();
    ensure(l);
    final long u = mU.next().longValueExact();
    ensure(u);
    final long v = mA.get(u);
    mA.set(u, mA.get(l));
    mA.set(l, v);
    return Z.valueOf(mA.get(mN));
  }
}
