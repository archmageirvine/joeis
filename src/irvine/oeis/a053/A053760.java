package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A053760 Smallest positive quadratic nonresidue modulo p, where p is the n-th prime.
 * @author Sean A. Irvine
 */
public class A053760 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.TWO.equals(p)) {
      return Z.TWO;
    }
    Z m = Z.ONE;
    while (true) {
      m = m.add(1);
      if (!ZUtils.isQuadraticResidue(m, p)) {
        return m;
      }
    }
  }
}
