package irvine.oeis.a065;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065806 A pseudo-random sequence.
 * @author Sean A. Irvine
 */
public class A065806 extends Sequence1 {

  private final HashMap<Long, Long> mB = new HashMap<>();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final long j = mB.getOrDefault(mN, mN) - mB.getOrDefault(mN - 1, mN - 1);
    final long c = mB.getOrDefault(mN, mN);
    mB.put(mN, mB.getOrDefault(j, j));
    mB.put(j, c);
    return Z.valueOf(j + 1);
  }
}
