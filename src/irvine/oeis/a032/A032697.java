package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000959;

/**
 * A032697 Exactly 1 digit from {1,2,3,4,5,6,7,8,9} can precede a(n) to form a lucky number.
 * @author Sean A. Irvine
 */
public class A032697 extends Sequence1 {

  private final A000959 mLucky = new A000959();
  private final TreeSet<Z> mLuckyNumbers = new TreeSet<>();
  {
    mLuckyNumbers.add(mLucky.next());
  }
  private long mN = -1;

  protected int expected() {
    return 1;
  }

  private boolean is(final long n) {
    int seen = 0;
    final String s = String.valueOf(n);
    for (int prefix = 1; prefix <= 9; ++prefix) {
      final Z t = new Z(prefix + s);
      while (mLuckyNumbers.last().compareTo(t) < 0) {
        mLuckyNumbers.add(mLucky.next());
      }
      if (mLuckyNumbers.contains(t) && ++seen > expected()) {
        return false;
      }
    }
    return seen == expected();
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
