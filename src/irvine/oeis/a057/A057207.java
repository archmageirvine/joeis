package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057207 <code>a(1)=5, a(n)</code> is the smallest prime dividing <code>4*Q^2 + 1</code> where Q is the product of all previous terms in the sequence.
 * @author Sean A. Irvine
 */
public class A057207 extends A057205 {

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
        if (p.mod(4) != 1) {
          return false;
        }
        first = p;
      } else {
        if (p.mod(4) == 1 && p.compareTo(first) < 0) {
          return false;
        }
      }
      n = n.divide(p);
    }
    return Z.ONE.equals(n);
  }

  @Override
  protected Z getCandidate() {
    return mProduct.shiftLeft(2).add(1);
  }

  @Override
  protected void updateProduct(final Z res) {
    mProduct = mProduct.multiply(res.square());
  }

}
