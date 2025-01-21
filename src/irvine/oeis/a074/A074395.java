package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074395 A 7-way classification of the primes.
 * @author Sean A. Irvine
 */
public class A074395 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.TWO.equals(p)) {
      return Z.SIX;
    }
    final Z q = mPrime.nextPrime(p);
    final int twin = q.subtract(p).equals(Z.TWO) ? 1 : 0;
    final int pm = (int) p.mod(4);
    final int qm = (int) q.mod(4);
    switch ((pm << 3) + (qm << 1) + twin) {
      case 0b01111:
        return Z.ZERO;
      case 0b11011:
        return Z.ONE;
      case 0b01110:
        return Z.TWO;
      case 0b11010:
        return Z.THREE;
      case 0b01010:
        return Z.FOUR;
      case 0b11110:
        return Z.FIVE;
      default:
        throw new RuntimeException();
    }
  }
}
