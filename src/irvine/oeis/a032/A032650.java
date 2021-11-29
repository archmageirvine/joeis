package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000959;

/**
 * A032650 Lucky numbers that are concatenations of a number k with itself.
 * @author Sean A. Irvine
 */
public class A032650 implements Sequence {

  private final A000959 mLucky = new A000959();
  private final TreeSet<Z> mLuckyNumbers = new TreeSet<>();
  {
    mLuckyNumbers.add(mLucky.next());
  }
  private long mN = (addend() & 1) - 1;

  protected int addend() {
    return 0;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z n = new Z(String.valueOf(mN) + (mN + addend()));
      while (mLuckyNumbers.last().compareTo(n) < 0) {
        mLuckyNumbers.add(mLucky.next());
      }
      if (mLuckyNumbers.contains(n)) {
        return n;
      }
    }
  }
}
