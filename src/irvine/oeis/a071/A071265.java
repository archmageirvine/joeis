package irvine.oeis.a071;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071265 Numbers which can be written in exactly two different ways as k + R(k) where R(k) is k reversed (A004086).
 * @author Sean A. Irvine
 */
public class A071265 extends Sequence1 {

  private final TreeMap<Long, Integer> mA = new TreeMap<>();
  private final int mTarget;
  private long mN = 1;

  protected A071265(final int target) {
    mTarget = target;
  }

  /** Construct the sequence. */
  public A071265() {
    this(2);
  }

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.firstKey() > mN) {
        final long r = Functions.REVERSE.l(mN);
        if (r <= mN) {
          mA.merge(mN + r, 1, Integer::sum);
        }
        ++mN;
      }
      final Map.Entry<Long, Integer> e = mA.pollFirstEntry();
      if (e.getValue() == mTarget) {
        return Z.valueOf(e.getKey());
      }
    }
  }
}

