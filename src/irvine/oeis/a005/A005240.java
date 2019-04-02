package irvine.oeis.a005;

import java.util.HashSet;
import java.util.Set;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A005240 P-positions in Epstein's Put or Take a Square game.
 * @author Sean A. Irvine
 */
public class A005240 implements Sequence {

  // loop = 0, p = 1, n = -1
  private LongDynamicByteArray mState = new LongDynamicByteArray();
  private long mN = -1;

  private int determineState(final Set<Long> visited, final long n, final boolean p) {
    if (visited.contains(n)) {
      return 0; // cycle
    }
    final byte c = mState.get(n);
    if (c != 0) {
      return c;
    }
    final long s = LongUtils.sqrt(n);
    final long a = s * s;
    if (n - a == 0) {
      return -1;
    }
    if (p) {
      visited.add(n);
      final int sm0 = determineState(visited, n - a, false);
      visited.remove(n);
      if (sm0 >= 0) {
        return -sm0;
      }
      visited.add(n);
      final int sm1 = determineState(visited, n + a, false);
      visited.remove(n);
      return -sm1;
    } else {
      visited.add(n);
      final int sm0 = determineState(visited, n - a, true);
      visited.remove(n);
      if (sm0 > 0) {
        return -sm0;
      }
      visited.add(n);
      final int sm1 = determineState(visited, n + a, true);
      visited.remove(n);
      return sm1 > 0 ? -1 : 0;
    }
  }

  protected int targetState() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      final int state;
      if (++mN == 0) {
        state = 1;
      } else if (mN == 1) {
        state = -1;
      } else {
        state = determineState(new HashSet<>(), mN, targetState() == 1);
      }
      mState.set(mN, (byte) state);
      if (state == targetState()) {
        return Z.valueOf(mN);
      }
    }
  }
}
