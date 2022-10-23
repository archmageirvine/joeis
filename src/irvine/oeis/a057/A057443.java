package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057443 For the numbers k that can be expressed as k = w + x = y*z with w*x = y^3 + z^3 where w, x, y, and z are all positive integers, this sequence gives the corresponding values of w*x.
 * @author Sean A. Irvine
 */
public class A057443 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 63;

  private void update(final long n) {
    final Z k = Z.valueOf(n);
    for (final Z y : Jaguar.factor(k).divisors()) {
      if (k.square().subtract(y.pow(3).multiply(4)).subtract(k.divide(y).pow(3).multiply(4)).isSquare()) {
        mA.add(y.pow(3).add(k.divide(y).pow(3)));
      }
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      update(++mN);
    }
    return mA.pollLast();
  }
}
