package irvine.oeis.a070;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070788 Positive integers n such that the Reverse and Add! trajectory of n (presumably) does not join the trajectory of any m &lt; n.
 * @author Sean A. Irvine
 */
public class A070788 extends Sequence1 {

  private static final int HEURISTIC = 1000;
  private final HashSet<Z> mSeen = new HashSet<>();
  private long mN = 0;

  private boolean is(Z t) {
    for (int k = 0; k < HEURISTIC; ++k) {
      t = Functions.REVERSE_AND_ADD.z(t);
      if (!mSeen.add(t)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      Z t = Z.valueOf(++mN);
      mSeen.remove(t);
      if (is(t)) {
        return t;
      }
    }
  }
}
