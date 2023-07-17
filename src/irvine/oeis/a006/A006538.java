package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A006538 Worst cases for Pierce expansions (denominators).
 * @author Sean A. Irvine
 */
public class A006538 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006538(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006538() {
    super(1);
  }

  private final LongDynamicLongArray mP = new LongDynamicLongArray();
  private final LongDynamicLongArray mMinA = new LongDynamicLongArray();
  protected final LongDynamicLongArray mMinB = new LongDynamicLongArray();
  private long mA = 0;
  protected long mN = 0;

  protected long v(final long a, final long k) {
    return a % k;
  }

  private void tryNextA() {
    ++mA;
    long n = 0;
    long b = 0;
    for (long k = 1; k <= mA; ++k) {
      final long pk = mP.get(v(mA, k)) + 1;
      mP.set(k, pk);
      if (pk > n) {
        n = pk;
        b = k;
      }
      final long bestB = mMinA.get(n);
      if (bestB == 0 || bestB > mA) {
        mMinA.set(n, mA);
        mMinB.set(n, b);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (mMinB.get(mN) == 0) {
      tryNextA();
    }
    //System.out.println("n=" + mN + " b=" + mMinB.get(mN));
    return Z.valueOf(mMinA.get(mN));
  }

}
