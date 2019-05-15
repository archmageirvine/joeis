package irvine.oeis.a022;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A022307 Number of distinct prime factors of n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A022307 extends A000045 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z f = super.next();
    return ++mN <= 2 ? Z.ZERO : Z.valueOf(Jaguar.factor(f).omega());
  }
}
