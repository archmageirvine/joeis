package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000959;

/**
 * A032660 Smallest n concatenated with <code>n + d (d = 0,1,2,3,...)</code> is a lucky number.
 * @author Sean A. Irvine
 */
public class A032660 implements Sequence {

  private final A000959 mLucky = new A000959();
  private final TreeSet<Z> mLuckyNumbers = new TreeSet<>();
  {
    mLuckyNumbers.add(mLucky.next());
  }
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long l = (mN & 1) - 1;
    while (true) {
      l += 2;
      final Z concat = new Z(String.valueOf(l) + (mN + l));
      while (mLuckyNumbers.last().compareTo(concat) < 0) {
        mLuckyNumbers.add(mLucky.next());
      }
      if (mLuckyNumbers.contains(concat)) {
        return Z.valueOf(l);
      }
    }
  }
}
