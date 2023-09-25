package irvine.oeis.a354;
// manually charfun at 2023-09-24 22:24

import irvine.math.z.Z;
import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a278.A278568;

/**
 * A354981 a(n) = 1 if n = 2 * p^k, with p an odd prime and k &gt;= 1, otherwise 0.
 * @author Georg Fischer
 */
public class A354981 extends CharacteristicFunction {

  private int mN = 0;

  /** Construct the sequence. */
  public A354981() {
    super(1, new A278568());
  }

  @Override
  public Z next() {
    final Z result = super.next();
    return (++mN == 2) ? Z.ZERO : result;
  }
}
