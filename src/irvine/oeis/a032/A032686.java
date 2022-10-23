package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000959;

/**
 * A032686 Numbers k such that k surrounded by digit '1' is a lucky number.
 * @author Sean A. Irvine
 */
public class A032686 extends Sequence1 {

  private final A000959 mLucky = new A000959();
  private final TreeSet<Z> mLuckyNumbers = new TreeSet<>();
  {
    mLuckyNumbers.add(mLucky.next());
  }
  private long mN = -1;

  protected String fix() {
    return "1";
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = new Z(fix() + ++mN + fix());
      while (mLuckyNumbers.last().compareTo(n) < 0) {
        mLuckyNumbers.add(mLucky.next());
      }
      if (mLuckyNumbers.contains(n)) {
        return Z.valueOf(mN);
      }
    }
  }
}
