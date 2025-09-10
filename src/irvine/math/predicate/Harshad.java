package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is a Harshad number.
 * @author Sean A. Irvine
 */
class Harshad extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public boolean is(final long base, final Z n) {
    return n.mod(Functions.DIGIT_SUM.l(base, n)) == 0;
  }

  @Override
  public boolean is(final long base, final long n) {
    return n % Functions.DIGIT_SUM.l(base, n) == 0;
  }
}
