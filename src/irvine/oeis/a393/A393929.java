package irvine.oeis.a393;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393929 a(n) is the sum of divisors of n whose decimal representation is not a substring of the decimal representation of n.
 * @author Sean A. Irvine
 */
public class A393929 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final String s = String.valueOf(++mN);
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (!s.contains(d.toString())) {
        sum = sum.add(d);
      }
    }
    return sum;
  }
}

