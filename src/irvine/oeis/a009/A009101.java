package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A009101 Fixed point when iterating the function f on n, where <code>f(x) = x +</code> product of digits of <code>x</code>.
 * @author Sean A. Irvine
 */
public class A009101 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    while (!ZUtils.containsZero(m)) {
      m = m.add(ZUtils.digitProduct(m));
    }
    return m;
  }
}
