package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is balanced (see A020492).
 * @author Georg Fischer
 */
public class Balanced extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return Functions.SIGMA1.z(n).mod(Functions.PHI.z(n)).isZero();
  }

  @Override
  public boolean is(final long n) {
    return Functions.SIGMA1.z(n).mod(Functions.PHI.l(n)) == 0;
  }
}
