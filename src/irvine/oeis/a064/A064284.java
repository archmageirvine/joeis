package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005132;
import irvine.util.array.LongDynamicByteArray;

/**
 * A064284 Number of times n appears in Recam\u00e1n's sequence A005132.
 * @author Sean A. Irvine
 */
public class A064284 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC_STEPS = 100000;
  private final LongDynamicByteArray mCounts = new LongDynamicByteArray();
  private final Sequence mRecaman = new A005132();
  private long mN = -1;

  @Override
  public Z next() {
    for (int k = 0; k < HEURISTIC_STEPS; ++k) {
      final long t = mRecaman.next().longValueExact();
      if (t <= mN) {
        throw new RuntimeException("Heuristic failed, previous reported value for " + t + " was too low");
      }
      final byte b = mCounts.get(t);
      if (b == Byte.MAX_VALUE) {
        throw new UnsupportedOperationException("Too many representations");
      }
      mCounts.set(t, (byte) (b + 1));
    }
    return Z.valueOf(mCounts.get(++mN));
  }
}
