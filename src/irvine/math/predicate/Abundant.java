package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is abundant.
 * @author Sean A. Irvine
 */
public class Abundant extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return Functions.SIGMA1.z(n).compareTo(n.multiply2()) > 0;
  }
}
