package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002619 Number of 2-colored patterns on an n X n board.
 * @author Sean A. Irvine
 */
public class A002619 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValueExact();
      final long m = mN / d;
      final long phi = LongUtils.phi(m);
      final Z t = Z.valueOf(m).pow(d).multiply(phi * phi).multiply(mF.factorial(d));
      sum = sum.add(t);
    }
    return sum.divide(mN * mN);
  }
}
