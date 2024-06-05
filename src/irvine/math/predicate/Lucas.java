package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is a Lucas number.
 * @author Sean A. Irvine
 */
public class Lucas extends AbstractPredicate {


  /**
   * If <code>n</code> is a Lucas number, then return its index; that is,
   * return the <i>k</i> such that <i>L</i>(<i>k</i>)=<code>n</code>. If the
   * supplied argument is not a Lucas number then the result will be a
   * negative index for a Lucas number with a value similar to the supplied
   * the argument (but not necessarily the closest Lucas number). This
   * method can be used to quickly determine if an integer appears in the
   * Lucas sequence.
   *
   * @param n nonnegative integer to get index for
   * @return <i>k</i> such that <i>L</i>(<i>k</i>)=<code>n</code>
   */
  public static int inverseLucas(final Z n) {
    // fail on negatives
    if (n.signum() <= 0) {
      throw new ArithmeticException("Only applicable to positive numbers");
    }

    // handle small cases
    if (Z.TWO.equals(n)) {
      return 0;
    }
    // note there are two possible answers in the next case, we return
    // the lower of the two
    if (Z.ONE.equals(n)) {
      return 1;
    }

    // handle general case
    int estimatedIndex = (int) (1.440420090412556479017551499657 * (double) n.bitLength());
    final Z l = Functions.LUCAS.z(estimatedIndex);
    if (l.equals(n)) {
      return estimatedIndex;
    } else if (l.compareTo(n) < 0) {
      return -estimatedIndex;
    }

    // try reducing estimate by 1
    final long n1 = --estimatedIndex;
    return Functions.LUCAS.z(n1).equals(n) ? estimatedIndex : -estimatedIndex;
  }

  @Override
  public boolean is(final Z n) {
    return inverseLucas(n) >= 0;
  }
}
