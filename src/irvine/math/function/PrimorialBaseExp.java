package irvine.math.function;

import irvine.math.z.Z;

/**
 * Expand the number into a primorial base exp representation.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
class PrimorialBaseExp extends AbstractFunction1 {

  @Override
  public Z z(Z n) {
    if (Z.TWO.compareTo(n) >= 0) {
      return n.add(1);
    }
    int ip = 1;
    while (Functions.PRIMORIAL_COUNT.z(ip).compareTo(n) <= 0) {
      ++ip;
    }
    Z result = Z.ONE;
    while (n.signum() > 0) {
      final Z pm = Functions.PRIMORIAL_COUNT.z(--ip);
      final Z[] qr = n.divideAndRemainder(pm);
//      if (qr[0].compareTo(Z.NINE) > 0) {
//        throw new UnsupportedOperationException("Ambiguous primorial base representation");
//      }
      n = qr[1];
      if (!qr[0].isZero()) {
        result = result.multiply(Functions.PRIME.z(ip + 1).pow(qr[0]));
      }
    }
    return result;
  }
}
