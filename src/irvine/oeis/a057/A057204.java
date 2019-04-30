package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057204 Primes congruent to <code>1 mod 6</code> generated recursively. Initial prime is 7. The next term is <code>p(n) =</code> Min {p is prime; p divides 4Q^2+3; Mod[p,6]=1}, where Q is the product of previous entries of the sequence.
 * @author Sean A. Irvine
 */
public class A057204 extends A057205 {

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
      if (!Z.ZERO.equals(n.mod(p))) {
        return false;
      }
      // Checks the ordering constraint
      if (first == null) {
        if (p.mod(6) != 1) {
          return false;
        }
        first = p;
      } else {
        if (p.mod(6) == 1 && p.compareTo(first) < 0) {
          return false;
        }
      }
      n = n.divide(p);
    }
    return Z.ONE.equals(n);
  }

  @Override
  protected Z getCandidate() {
    return mProduct.shiftLeft(2).add(3);
  }

  @Override
  protected void updateProduct(final Z res) {
    mProduct = mProduct.multiply(res.square());
  }

}
