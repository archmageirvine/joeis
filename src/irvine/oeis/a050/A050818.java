package irvine.oeis.a050;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A050818 Even numbers seen in decimal expansion of Pi (disregarding the decimal period) contiguous, smallest and distinct.
 * @author Sean A. Irvine
 */
public class A050818 extends A000796 {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mLookAhead = super.next(); // to handle zeros!

  @Override
  public Z next() {
    Z t = Z.ZERO;
    do {
      t = t.multiply(10).add(mLookAhead);
      mLookAhead = super.next();
    } while (t.isOdd() || (mLookAhead.isZero() && mSeen.contains(Z.ZERO)) || mSeen.contains(t));
    mSeen.add(t);
    return t;
  }
}
