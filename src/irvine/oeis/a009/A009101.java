package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A009101 Fixed point when iterating the function f on <code>n,</code> where f(x) <code>= x +</code> product of digits of x.
 * @author Sean A. Irvine
 */
public class A009101 implements Sequence {

  private long mN = -1;

  private boolean containsZero(Z n) {
    if (n.equals(Z.ZERO)) {
      return true;
    }
    while (!Z.ZERO.equals(n)) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (Z.ZERO.equals(qr[1])) {
        return true;
      }
      n = qr[0];
    }
    return false;
  }

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    while (!containsZero(m)) {
      m = m.add(ZUtils.digitProduct(m));
    }
    return m;
  }
}
