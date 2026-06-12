package irvine.oeis.a395;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A395076 allocated for Marc Morgenegg.
 * @author Sean A. Irvine
 */
public class A395076 extends Sequence0 {

  // After Marc Morgenegg

  private final HashSet<Pair<Long, Long>> mSeenPairs = new HashSet<>();
  private long mA = -1;

  @Override
  public Z next() {
    if (mA == -1) {
      mA = 0;
      return Z.ZERO;
    }
    long d = 0;
    final long next;
    while (true) {
      if (mA - d >= 0 && !mSeenPairs.contains(new Pair<>(mA, mA - d))) {
        next = mA - d;
        break;
      }
      if (!mSeenPairs.contains(new Pair<>(mA, mA + d))) {
        next = mA + d;
        break;
      }
      ++d;
    }
    mSeenPairs.add(new Pair<>(mA, next));
    mA = next;
    return Z.valueOf(next);
  }
}
