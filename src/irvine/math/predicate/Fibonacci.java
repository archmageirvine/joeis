package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is a Fibonacci number.
 * @author Sean A. Irvine
 */
public class Fibonacci extends AbstractPredicate {

  /**
   * If <code>n</code> is a Fibonacci number, then return its index; that is,
   * return the <i>k</i> such that <i>F</i>(<i>k</i>)=<code>n</code>. If the
   * supplied argument is not a Fibonacci number then the result will be a
   * negative index for a Fibonacci number with a value similar to the supplied
   * the argument (but not necessarily the closest Fibonacci number). This
   * method can be used to quickly determine if an integer appears in the
   * Fibonacci sequence.
   *
   * @param n nonnegative integer to get index for
   * @return <i>k</i> such that <i>F</i>(<i>k</i>)=<code>n</code>
   */
  public static int inverseFibonacci(final Z n) {
    // fail on negatives
    if (n.signum() < 0) {
      throw new ArithmeticException("Only applicable to positive numbers");
    }

    // handle small cases
    if (n.isZero()) {
      return 0;
    }
    // note there are two possible answers in the next case, we return
    // the lower of the two
    if (n.equals(Z.ONE)) {
      return 1;
    }

    // handle general case
    int estimatedIndex = (int) (1.440420090412556479017551499657 * (n.bitLength() + 1.160964047443681173935159714711));
    final Z f = Functions.FIBONACCI.z((long) estimatedIndex);
    if (f.equals(n)) {
      return estimatedIndex;
    } else if (f.compareTo(n) < 0) {
      return -estimatedIndex;
    }

    // try reducing estimate by 1
    final long n1 = --estimatedIndex;
    return Functions.FIBONACCI.z(n1).equals(n) ? estimatedIndex : -estimatedIndex;
  }

  @Override
  public boolean is(final Z n) {
    return inverseFibonacci(n) >= 0;
  }
}
