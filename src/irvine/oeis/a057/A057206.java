package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057206 Primes of the form 6k+5 generated recursively: a(1)=5; a(n) = min{p, prime; p mod 6 = 5; p | 6Q-1}, where Q is the product of all previous terms in the sequence.
 * @author Sean A. Irvine
 */
public class A057206 extends A057205 {

  @Override
  protected boolean checkProduct(final String factors) {
    Z first = null;
    Z n = getCandidate();
    for (final String f : factors.split("\\.")) {
      if (f.startsWith("P")) {
        if (!n.isProbablePrime()) {
          return false;
        }
        final int len = Integer.parseInt(f.substring(1));
        return len == n.toString().length();
      }
      if (f.startsWith("C")) {
        if (n.isProbablePrime()) {
          return false;
        }
        final int len = Integer.parseInt(f.substring(1));
        return len == n.toString().length();
      }
      final Z p = new Z(f);
      if (!p.isProbablePrime()) {
        return false;
      }
      if (!n.mod(p).isZero()) {
        return false;
      }
      // Checks the ordering constraint
      if (first == null) {
        if (p.mod(6) != 5) {
          return false;
        }
        first = p;
      } else {
        if (p.mod(6) == 5 && p.compareTo(first) < 0) {
          return false;
        }
      }
      n = n.divide(p);
    }
    return Z.ONE.equals(n);
  }

  @Override
  protected Z getCandidate() {
    return mProduct.multiply(6).subtract(1);
  }

}
