package irvine.oeis.a080;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080439 a(1) = 11, a(n) is the smallest prime obtained by inserting digits between every pair of digits of a(n-1).
 * @author Sean A. Irvine
 */
public class A080439 extends Sequence1 {

  private Z mA = null;
  private final long mStart;

  protected A080439(final long start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A080439() {
    this(11);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(mStart);
    } else {
      final String s = String.valueOf(mA);
      final Z res = A080437.search(s, Z.valueOf(s.charAt(0) - '0'), 1);
      if (res != null) {
        mA = res;
      } else {
        final TreeSet<Z> set = new TreeSet<>();
        A080437.searchHarder(set, s, Z.valueOf(s.charAt(0) - '0'), 1);
        if (set.isEmpty()) {
          throw new RuntimeException("Search was insufficient to find a solution");
        }
        mA = set.pollFirst();
      }
    }
    return mA;
  }
}

