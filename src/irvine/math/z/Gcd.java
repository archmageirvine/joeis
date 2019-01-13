package irvine.math.z;

/**
 * Greatest common divisor.
 *
 * @author Sean A. Irvine
 */
final class Gcd {

  private Gcd() { }

  /**
   * The greatest common divisor of this integer with another integer.
   * @param a integer
   * @param b other integer
   * @return the gcd
   */
  static Z gcd(final Z a, final Z b) {
    final Z aAbs = a.abs();
    final Z bAbs = b.abs();
    // Handle zeros
    final int aSize = aAbs.getSize();
    if (aSize == 0) {
      return bAbs;
    }
    final int bSize = bAbs.getSize();
    if (bSize == 0) {
      return aAbs;
    }
    if (aAbs.equals(bAbs)) {
      return aAbs;
    }
    // Handle special case where one divides the other
    if (aSize >= bSize && Mod.mod(aAbs, bAbs).getSize() == 0) {
      return bAbs;
    } else if (aSize <= bSize && Mod.mod(bAbs, aAbs).getSize() == 0) {
      return aAbs;
    }
    final Z aOdd = aAbs.makeOdd();
    final Z bOdd = bAbs.makeOdd();
    final int gcdPowersOf2 = Math.min((int) aAbs.auxiliary(), (int) bAbs.auxiliary());
    final int c0 = aOdd.compareTo(bOdd);
    if (c0 == 0) {
      return aOdd.shiftLeft(gcdPowersOf2);
    }
    // Make aa > bb
    Z aa, bb;
    if (c0 < 0) {
      aa = bOdd;
      bb = aOdd;
    } else {
      aa = aOdd;
      bb = bOdd;
    }
    Z cc = Sub.sub(aa, bb).makeOdd();
    do {
      final int c = bb.compareTo(cc);
      if (c == 0) {
        aa = bb;
        break;
      } else if (c > 0) {
        aa = bb;
        bb = cc;
      } else {
        aa = cc;
      }
      cc = Sub.sub(aa, bb).makeOdd();
    } while (cc.getSize() != 0);
    return aa.shiftLeft(gcdPowersOf2);
  }
}
