package irvine.oeis.a063;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063048 Numbers n such that the Reverse and Add! trajectory of n (presumably) does not reach a palindrome and does not join the trajectory of any term m &lt; n.
 * @author Sean A. Irvine
 */
public class A063048 extends Sequence1 {

  // NOTE This sequence is inherently heuristic

  private Z mN = Z.NINE;
  private final HashSet<Z> mSeen = new HashSet<>();
  private final long mBase;

  protected A063048(final long base) {
    mBase = base;
  }

  /** Construct the sequence. */
  public A063048() {
    this(10);
  }

  private boolean is(Z n, final int limit) {
    for (int k = 0; k < limit; ++k) {
      if (!mSeen.add(n)) {
        return true;
      }
      if (Predicates.PALINDROME.is(mBase, n)) {
        return true;
      }
      n = n.add(Functions.REVERSE.z(mBase, n));
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!is(mN, 1000)) {
        return mN;
      }
    }
  }
}
