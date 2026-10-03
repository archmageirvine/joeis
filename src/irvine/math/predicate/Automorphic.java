package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a Harshad number.
 * @author Sean A. Irvine
 */
class Automorphic extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public boolean is(final long base, Z n) {
    if (n.isZero()) {
      return true;
    }
    Z s = n.square();
    while (!n.isZero()) {
      final Z[] qrn = n.divideAndRemainder(base);
      final Z[] qrs = s.divideAndRemainder(base);
      if (!qrn[1].equals(qrs[1])) {
        return false;
      }
      n = qrn[0];
      s = qrs[0];
    }
    return true;
  }
}
