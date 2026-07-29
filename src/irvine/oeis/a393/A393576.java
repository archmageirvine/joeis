package irvine.oeis.a393;
// manually robots/multraf at 2026-07-28 10:46

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002473;

/**
 * A393576 Greatest common divisors of consecutive 7-smooth numbers.
 * @author Georg Fischer
 */
public class A393576 extends A002473 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z b = super.next();
    final Z result = Functions.GCD.z(mA, b);
    mA = b;
    return result;
  }
}
