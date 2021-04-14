package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046529 Largest number in largest finite set fixed by mapping f(k) = sum of n-th power of digits of k.
 * @author Sean A. Irvine
 */
public class A046529 implements Sequence {

  private int mN = -1;
  private long mLim = 1;

  private Z digitPowerSum(Z n, final int power) {
    Z sum = Z.ZERO;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      sum = sum.add(qr[1].pow(power));
      n = qr[0];
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mLim *= 10;

    TreeSet<Z> longest = new TreeSet<>();
    final TreeSet<Z> seen = new TreeSet<>();
    for (long m = 1; m < mLim; ++m) { // todo !!! how to choose this limit
      Z t = Z.valueOf(m);
      seen.clear();
      seen.add(t);
      do {
        t = digitPowerSum(t, mN);
      } while (seen.add(t));
      final TreeSet<Z> loop = new TreeSet<>();
      loop.add(t);
      do {
        t = digitPowerSum(t, mN);
      } while (loop.add(t));
      if (loop.size() > longest.size() || (loop.size() == longest.size() && loop.last().compareTo(longest.last()) > 0)) {
        longest = loop;
      }
    }
    return longest.last();
  }
}

