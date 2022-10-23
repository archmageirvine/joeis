package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057421 Consider the solutions to k = a+b = x*y and a*b = k*(x+y) where k, a, b, x, and y are all positive integers, ordered by increasing k and, in case of ties, by increasing x. Sequence gives values of a*b.
 * @author Sean A. Irvine
 */
public class A057421 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 63;

  private void update(final long n) {
    final Z k = Z.valueOf(n);
    for (final Z y : Jaguar.factor(k).divisors()) {
      if (k.square().subtract(y.add(k.divide(y)).multiply(k).multiply(4)).isSquare()) {
        mA.add(k.multiply(y.add(k.divide(y))));
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
