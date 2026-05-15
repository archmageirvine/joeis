package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051037;
import irvine.util.array.LongDynamicByteArray;

/**
 * A395530 a(n) is the least number of 5-smooth numbers that add up to n.
 * @author Sean A. Irvine
 */
public class A395530 extends Sequence1 {

  private long mN = 0;
  private final LongDynamicByteArray mLeast = new LongDynamicByteArray();
  private final Sequence mS;
  private long mA;

  protected A395530(final Sequence seq) {
    mS = seq;
    mA = mS.next().longValueExact();
  }

  /** Construct the sequence. */
  public A395530() {
    this(new A051037());
  }

  @Override
  public Z next() {
    if (++mN == mA) {
      mLeast.set(mA, (byte) 1);
      for (long k = mLeast.length(); k >= 0; --k) {
        final int v = mLeast.get(k);
        if (v != 0) {
          final int u = mLeast.get(k + mA);
          if (u == 0 || v + 1 < u) {
            mLeast.set(k + mA, (byte) (v + 1));
          }
        }
      }
      mA = mS.next().longValueExact();
    }
    return Z.valueOf(mLeast.get(mN));
  }
}
