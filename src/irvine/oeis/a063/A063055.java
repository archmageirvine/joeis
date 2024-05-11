package irvine.oeis.a063;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A063055 Integers n &gt; 1997 such that the 'Reverse and Add!' trajectory of n joins the trajectory of 1997.
 * @author Sean A. Irvine
 */
public class A063055 extends Sequence0 {

  private final Sequence mA;
  private Z mN;
  private final TreeSet<Z> mSeen = new TreeSet<>();

  protected A063055(final Sequence parent, final long start) {
    mA = parent;
    mSeen.add(mA.next()); // avoid need for isEmpty checking
    mN = Z.valueOf(start);
  }

  /** Construct the sequence. */
  public A063055() {
    this(new A063054(), 2995);
  }

  private boolean is(Z n, final int limit) {
    for (int k = 0; k < limit; ++k) {
      while (mSeen.last().compareTo(n) < 0) {
        mSeen.add(mA.next());
      }
      if (mSeen.contains(n)) {
        return true;
      }
      if (Predicates.PALINDROME.is(10, n)) {
        return false;
      }
      n = n.add(Functions.REVERSE.z(n));
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN, 1000)) {
        return mN;
      }
    }
  }
}
