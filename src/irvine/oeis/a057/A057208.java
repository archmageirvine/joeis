package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057208 Primes of the form 8k+5 generated recursively: a(1)=5, a(n) = least prime p == 5 (mod 8) with p | 4+Q^2, where Q is the product of all previous terms in the sequence.
 * @author Sean A. Irvine
 */
public class A057208 extends A057205 {

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
        if (p.mod(8) != 5) {
          return false;
        }
        first = p;
      } else {
        if (p.mod(8) == 5 && p.compareTo(first) < 0) {
          return false;
        }
      }
      n = n.divide(p);
    }
    return Z.ONE.equals(n);
  }

  @Override
  protected Z getCandidate() {
    return mProduct.add(4);
  }

  @Override
  protected void updateProduct(final Z res) {
    mProduct = mProduct.multiply(res.square());
  }

}
