package irvine.math.polynomial;

import irvine.util.Pair;

/**
 * Placeholder type.
 * @author Sean A. Irvine
 * @param <E> underlying element type
 */
public class RationalFunction<E> extends Pair<Polynomial<E>, Polynomial<E>> {

  /**
   * Construct a rational function.
   * @param num numerator
   * @param den denominator
   */
  public RationalFunction(final Polynomial<E> num, final Polynomial<E> den) {
    super(num, den);
  }

  @Override
  public String toString() {
    String num = left().toString();
    String den = right().toString();
    if ("1".equals(den)) {
      return num;
    }
    if (num.contains("+") || num.contains("-")) {
      num = '(' + num + ')';
    }
    if (den.contains("+") || den.contains("-")) {
      den = '(' + den + ')';
    }
    return num + '/' + den;
  }
}
