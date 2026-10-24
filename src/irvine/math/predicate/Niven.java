package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is a Niven (or Harshad) number (see A005349, numbers that are divisible by the sum of their digits).
 * @author Georg Fischer
 */
public class Niven extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return n.mod(Functions.DIGIT_SUM.l(n)) == 0;
  }

}
