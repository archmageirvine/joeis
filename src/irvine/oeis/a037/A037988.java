package irvine.oeis.a037;

import java.util.LinkedList;

import irvine.math.MutableInteger;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A037988 Critical values in Conway's game of one-dimensional phutball.
 * @author Sean A. Irvine
 */
public class A037988 implements Sequence {

  // Based on Eric Angelini's comment

  private int mN = 0; // Term number
  private int mM = 0; // Last term output (sequence must increase)

  private final LinkedList<Pair<Integer, MutableInteger>> mLimits = new LinkedList<>();

  @Override
  public Z next() {
    ++mN; // term number
    while (true) {
      ++mM; // We need to check if we can play this number
      // Discard any limits already surpassed
      while (!mLimits.isEmpty() && mLimits.peekFirst().left() < mM) {
        mLimits.removeFirst();
      }
      if (mLimits.isEmpty()) {
        break; // mM is trivially allowed
      }
      final Pair<Integer, MutableInteger> first = mLimits.peekFirst();
      if (2 * first.right().get() < first.left()) {
        // Yes we can play, bump the counts of all existing limits
        for (final Pair<Integer, MutableInteger> limit : mLimits) {
          limit.right().postIncrement();
        }
        break; // we will return mM and construct a new limit
      }
    }
    mLimits.add(new Pair<>(mM * 2, new MutableInteger(mN)));
    return Z.valueOf(mM);
  }
}
