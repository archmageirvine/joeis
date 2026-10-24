package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is a Carmichael number (see A002997).
 * @author Georg Fischer
 */
public class Carmichael extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return n.mod(Functions.CARMICHAEL_LAMBDA.z(n)).equals(Z.ONE) && !n.isProbablePrime();
  }

  @Override
  public boolean is(final long n) {
    return n % Functions.CARMICHAEL_LAMBDA.l(n) == 1L && !Z.valueOf(n).isProbablePrime();
  }
}
