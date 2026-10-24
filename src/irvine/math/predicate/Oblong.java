package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is oblong, that is of the form n*(n + 1) (see A002378).
 * @author Georg Fischer
 */
public class Oblong extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    final Z s = Functions.SQRT.z(n);
    return n.equals(s.multiply(s.add(1)));
  }

  @Override
  public boolean is(final long n) {
    final long s = Functions.SQRT.l(n);
    return n == s * (s + 1);
  }
}
