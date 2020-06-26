package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000959;

/**
 * A032791 <code>n(n+1)(n+2) / (n+(n+1)+(n+2))</code> is a lucky number.
 * @author Sean A. Irvine
 */
public class A032791 implements Sequence {

  private final A000959 mLucky = new A000959();
  private final TreeSet<Z> mLuckyNumbers = new TreeSet<>();
  {
    mLuckyNumbers.add(mLucky.next());
  }
  private long mN = -1;

  protected long t() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z a = Z.ONE;
      for (long k = 0; k <= t(); ++k) {
        a = a.multiply(mN + k);
      }
      final Z[] qr = a.divideAndRemainder(Z.valueOf((t() + 1) * mN + t() * (t() + 1) / 2));
      if (Z.ZERO.equals(qr[1])) {
        while (mLuckyNumbers.last().compareTo(qr[0]) < 0) {
          mLuckyNumbers.add(mLucky.next());
        }
        if (mLuckyNumbers.contains(qr[0])) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
