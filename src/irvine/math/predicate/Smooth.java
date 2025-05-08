package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is a p-smooth (see A003586): all prime divisors are &lt;= p.
 * @author Georg Fischer
 */
public class Smooth extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 3;
  }

  @Override
  public boolean is(final long base, final Z n) {
    return Functions.GPF.l(n) <= base;
  }

  @Override
  public boolean is(final long base, final long n) {
    return Functions.GPF.l(n) <= base;
  }
}
