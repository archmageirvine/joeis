package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a001.A001950;
import irvine.util.array.LongDynamicLongArray;

/**
 * A002251 Start with the nonnegative integers; then swap L(k) and U(k) for all k &gt;= 1, where L = A000201, U = A001950 (lower and upper Wythoff sequences).
 * @author Sean A. Irvine
 */
public class A002251 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002251(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002251() {
    super(0);
  }

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
