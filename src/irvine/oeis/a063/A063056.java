package irvine.oeis.a063;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A063056 a(n) = number of 'Reverse and Add!' operations that have to be applied to the n-th term of A063055 in order to obtain a term in the trajectory of 1997.
 * @author Sean A. Irvine
 */
public class A063056 extends Sequence1 {

  private final Sequence mA;
  private Z mN;
  private final TreeSet<Z> mSeen = new TreeSet<>();

  protected A063056(final Sequence parent, final long start) {
    mA = parent;
    mSeen.add(mA.next()); // avoid need for isEmpty checking
    mN = Z.valueOf(start);
  }

  /** Construct the sequence. */
  public A063056() {
    this(new A063054(), 2995);
  }

  private int is(Z n, final int limit) {
    for (int k = 0; k < limit; ++k) {
      while (mSeen.last().compareTo(n) < 0) {
        mSeen.add(mA.next());
      }
      if (mSeen.contains(n)) {
        return k;
      }
      if (ZUtils.isPalindrome(n, 10)) {
        return -1;
      }
      n = n.add(ZUtils.reverse(n));
    }
    return -1;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int cnt = is(mN, 1000);
      if (cnt >= 0) {
        return Z.valueOf(cnt);
      }
    }
  }
}
