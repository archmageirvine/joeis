package irvine.oeis.a071;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071914 Numbers n of the form k + reverse(k) for exactly three k.
 * @author Sean A. Irvine
 */
public class A071914 extends Sequence1 {

  private final TreeMap<Long, Integer> mA = new TreeMap<>();
  private final int mTarget;
  private long mN = 1;

  protected A071914(final int target) {
    mTarget = target;
  }

  /** Construct the sequence. */
  public A071914() {
    this(3);
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

