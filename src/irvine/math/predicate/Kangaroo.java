package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a kangaroo.
 * @author Sean A. Irvine
 */
public class Kangaroo extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    final String s = n.toString();
    final Z m = new Z(s.substring(1, s.length() - 1));
    return !m.isZero() && n.mod(m).isZero();
  }

  @Override
  public boolean is(final long n) {
    final String s = String.valueOf(n);
    final long m = Long.parseLong(s.substring(1, s.length() - 1));
    return m != 0 && n % m == 0;
  }
}
