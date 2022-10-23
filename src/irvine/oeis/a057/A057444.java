package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057444 For the numbers k that can be expressed as k = w + x = y*z with w*x = y^2 + z^2 where w, x, y, and z are all positive integers, this sequence gives the corresponding values of w*x.
 * @author Sean A. Irvine
 */
public class A057444 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 8;

  private void update(final long n) {
    final Z k = Z.valueOf(n);
    for (final Z y : Jaguar.factor(k).divisors()) {
      if (k.square().subtract(y.square().multiply(4)).subtract(k.divide(y).square().multiply(4)).isSquare()) {
        mA.add(y.square().add(k.divide(y).square()));
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
