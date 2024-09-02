package irvine.oeis.a072;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072040 Numbers n of the form k + reverse(k) for exactly two k.
 * @author Sean A. Irvine
 */
public class A072040 extends Sequence1 {

  private final TreeMap<Long, Integer> mA = new TreeMap<>();
  private final int mTarget;
  private long mN = 1;

  protected A072040(final int target) {
    mTarget = target;
  }

  /** Construct the sequence. */
  public A072040() {
    this(2);
  }

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.firstKey() > mN) {
        final long r = Functions.REVERSE.l(mN);
        mA.merge(mN + r, 1, Integer::sum);
        ++mN;
      }
      final Map.Entry<Long, Integer> e = mA.pollFirstEntry();
      if (e.getValue() == mTarget) {
        return Z.valueOf(e.getKey());
      }
    }
  }
}

