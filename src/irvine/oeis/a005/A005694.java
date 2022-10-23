package irvine.oeis.a005;

import java.util.HashMap;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005694 Positions of remoteness 6 in Beans-Don't-Talk.
 * @author Sean A. Irvine
 */
public class A005694 extends Sequence1 {

  private static final int NOT_YET_COMPUTABLE = -1;
  private static final int TERMINATING_RECURSION = -2;

  private static int pos(final int n) {
    int v = 3 * n + 1;
    while ((v & 1) == 0) {
      v >>>= 1;
    }
    return v;
  }

  private static int neg(final int n) {
    int v = 3 * n - 1;
    while ((v & 1) == 0) {
      v >>>= 1;
    }
    return v;
  }

  private final HashMap<Integer, Integer> mCache = new HashMap<>();

  private void store(final int n, final int v) {
    if (v > NOT_YET_COMPUTABLE) {
      mCache.put(n, v);
    }
  }

  private Integer computeRemoteness(final HashSet<Integer> previouslyQueued, final int n) {
    if (n == 1) {
      return 0;
    }
    final Integer remoteness = mCache.get(n);
    if (remoteness != null) {
      return remoteness;
    }
    if (previouslyQueued.contains(TERMINATING_RECURSION)) {
      return TERMINATING_RECURSION; // terminating computation because a new value was determined
    }
    if (!previouslyQueued.add(n)) {
      return NOT_YET_COMPUTABLE;
    }
    final int pos = pos(n);
    if (pos == 1) {
      return 1; // Efficiency
    }
    final int neg = neg(n);
    if (neg == 1) {
      return 1; // Efficiency
    }
    final int remotePos = computeRemoteness(previouslyQueued, pos);
    final int remoteNeg = computeRemoteness(previouslyQueued, neg);
    //System.out.println("Processing request for " + n + " -> " + "pos=" + pos + ": " + remotePos + ", neg=" + neg + ": " + remoteNeg);
    if (remotePos == NOT_YET_COMPUTABLE) {
      if (remoteNeg == NOT_YET_COMPUTABLE) {
        return NOT_YET_COMPUTABLE;
      }
      if ((remoteNeg & 1) == 1) {
        return NOT_YET_COMPUTABLE;
      }
      //System.out.println("rA(" + n + ")=" + (remoteNeg + 1));
      previouslyQueued.add(TERMINATING_RECURSION);
      store(n, remoteNeg + 1);
      return remoteNeg + 1;
    } else if (remoteNeg == NOT_YET_COMPUTABLE) {
      if ((remotePos & 1) == 1) {
        return NOT_YET_COMPUTABLE;
      }
      //System.out.println("rB(" + n + ")=" + (remotePos + 1));
      previouslyQueued.add(TERMINATING_RECURSION);
      store(n, remotePos + 1);
      return remotePos + 1;
    }
    if ((remoteNeg & 1) == 0 && (remotePos & 1) == 0) {
      previouslyQueued.add(TERMINATING_RECURSION);
      final int r = Math.min(remoteNeg, remotePos) + 1;
      store(n, r);
      //System.out.println("rC(" + n + ")=" + r);
      return r;
    } else if ((remoteNeg & 1) == 0) {
      previouslyQueued.add(TERMINATING_RECURSION);
      store(n, remoteNeg + 1);
      return remoteNeg + 1;
    } else if ((remotePos & 1) == 0) {
      previouslyQueued.add(TERMINATING_RECURSION);
      store(n, remotePos + 1);
      return remotePos + 1;
    } else {
      previouslyQueued.add(TERMINATING_RECURSION);
      final int r = Math.max(remoteNeg, remotePos) + 1;
      store(n, r);
      //System.out.println("rD(" + n + ")=" + r);
      return r;
    }
  }

  protected int remoteness(final int n) {
    int remoteness;
    while ((remoteness = computeRemoteness(new HashSet<>(), n)) <= NOT_YET_COMPUTABLE) {
      // do nothing
    }
    return remoteness;
  }

  private int mN = 0;

  @Override
  public Z next() {
//    System.out.println("r(2)=" + remoteness(new HashSet<>(), 2));
    while (true) {
      if (remoteness(++mN) == 6) {
        return Z.valueOf(mN);
      }
    }
  }
}
