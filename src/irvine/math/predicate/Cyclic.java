package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is cyclic.
 * @author Sean A. Irvine
 */
public class Cyclic extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return n.compareTo(Z.TWO) <= 0 || (n.isOdd() && Functions.GCD.z(n, Functions.PHI.z(n)).isOne());
  }

  @Override
  public boolean is(final long n) {
    return n <= 2 || ((n & 1) == 1 && Functions.GCD.l(n, Functions.PHI.l(n)) == 1);
  }
}
