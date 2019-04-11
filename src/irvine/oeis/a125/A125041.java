package irvine.oeis.a125;

import irvine.math.z.Z;
import irvine.oeis.a057.A057205;

/**
 * A125041 Primes of the form <code>24k+17</code> generated recursively. Initial prime is <code>17.</code> General term is a(n)=Min {p is prime; p divides (2Q)^4 <code>+ 1</code>; Mod[p,24]=17}, where Q is the product of previous terms in the sequence.
 * @author Sean A. Irvine
 */
public class A125041 extends A057205 {

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
      if (f.startsWith("(")) {
        final Z c = new Z(f.substring(1, f.indexOf(')')));
        return !n.isProbablePrime() && n.equals(c);
      }
      final Z p = new Z(f);
      if (!p.isProbablePrime()) {
        return false;
      }
      if (!Z.ZERO.equals(n.mod(p))) {
        return false;
      }
      // Checks the ordering constraint
      if (first == null) {
        if (p.mod(24) != 17) {
          return false;
        }
        first = p;
      } else {
        if (p.mod(24) == 17 && p.compareTo(first) < 0) {
          return false;
        }
      }
      n = n.divide(p);
    }
    return Z.ONE.equals(n);
  }

  @Override
  protected Z getCandidate() {
    return mProduct.multiply2().pow(4).add(1);
  }

  @Override
  protected void updateProduct(final Z res) {
    mProduct = mProduct.multiply(res);
  }

}
