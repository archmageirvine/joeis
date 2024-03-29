package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000959;

/**
 * A032792 Quotients k*(k+1)*(k+2) / (k+(k+1)+(k+2)) that are lucky numbers.
 * @author Sean A. Irvine
 */
public class A032792 extends Sequence1 {

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
      if (qr[1].isZero()) {
        while (mLuckyNumbers.last().compareTo(qr[0]) < 0) {
          mLuckyNumbers.add(mLucky.next());
        }
        if (mLuckyNumbers.contains(qr[0])) {
          return qr[0];
        }
      }
    }
  }
}
