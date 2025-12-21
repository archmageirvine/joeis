package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A082734 For n odd, a(n) is the least positive integer not already used. For n even, a(n) is 1 plus the lcm of the last n/2 terms.
 * @author Sean A. Irvine
 */
public class A082734 extends CachedSequence {

  private final TreeSet<Z> mUsed = new TreeSet<>();
  private Z mLeastUnused = Z.ONE;

  /** Construct the sequence. */
  public A082734() {
    super(1);
  }

  @Override
  protected Z compute(final Z n) {
    if (n.isOdd()) {
      while (mUsed.remove(mLeastUnused)) {
        mLeastUnused = mLeastUnused.add(1);
      }
      mUsed.add(mLeastUnused);
      return mLeastUnused;
    } else {
      Z lcm = Z.ONE;
      for (long k = 1; k <= n.divide2().longValue(); ++k) {
        lcm = lcm.lcm(a(n.subtract(k)));
      }
      lcm = lcm.add(1);
      mUsed.add(lcm);
      return lcm;
    }
  }
}
