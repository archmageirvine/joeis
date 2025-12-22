package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A082746 For n odd, a(n) is the least positive integer not already used. For n even, a(n) is the least positive integer not already used that is coprime to a(n/2).
 * @author Sean A. Irvine
 */
public class A082746 extends CachedSequence {

  private final TreeSet<Z> mUsed = new TreeSet<>();
  private Z mLeastUnused = Z.ONE;

  /** Construct the sequence. */
  public A082746() {
    super(1);
  }

  @Override
  protected Z compute(final Z n) {
    while (mUsed.remove(mLeastUnused)) {
      mLeastUnused = mLeastUnused.add(1);
    }
    if (n.isOdd()) {
      mUsed.add(mLeastUnused);
      return mLeastUnused;
    } else {
      final Z g = a(n.divide2());
      Z k = mLeastUnused;
      while (true) {
        if (!mUsed.contains(k) && Functions.GCD.z(g, k).isOne()) {
          mUsed.add(k);
          return k;
        }
        k = k.add(1);
      }
    }
  }
}
