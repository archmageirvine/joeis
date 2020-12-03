package irvine.math.z;

/**
 * Implementation of the extended Euclidean algorithm. In general to be
 * accessed via the Z class.
 *
 * @author Sean A. Irvine
 */
final class ExtendedEuclid {

  private ExtendedEuclid() { }

  /**
   * Apply the extended Euclidean algorithm.  Returns the gcd of <code>a</code>
   * and <code>b</code>, together with numbers <code>u</code> and
   * <code>v</code> such that <code>d=au+bv</code>.
   *
   * @param a first number
   * @param b second number
   * @return three integers
   */
  static Z[] extendedEuclid(final Z a, final Z b) {
    if (a.isZero()) {
      return new Z[] {b, Z.ZERO, Z.ONE};
    }
    if (b.isZero()) {
      return new Z[] {a, Z.ONE, Z.ZERO};
    }
    final Z aabs = a.abs();
    final Z babs = b.abs();
    final int signDelta = aabs.compareTo(babs);
    if (signDelta == 0) {
      return new Z[] {a, Z.ONE, Z.ZERO};
    }
    final Z d, u, v;
    if (signDelta > 0) {
      // a is larger than b
      final Z[] t = Euclid.euclid(aabs, babs);
      d = t[1];
      u = t[0];
      v = t[1].subtract(aabs.multiply(t[0])).divide(babs);
    } else {
      // b is larger than a
      final Z[] t = Euclid.euclid(babs, aabs);
      d = t[1];
      u = t[1].subtract(babs.multiply(t[0])).divide(aabs);
      v = t[0];
    }
    return new Z[] {d, a == aabs ? u : u.negate(), b == babs ? v : v.negate()};
  }

}
