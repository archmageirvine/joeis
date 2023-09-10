package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A065742 Primes p(m) such that the set of quadratic residues modulo[p(m)] contains p(m-1).
 * @author Sean A. Irvine
 */
public class A065742 extends A000040 {

  private Z mQ = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z q = mQ;
      mQ = super.next();
      if (ZUtils.isQuadraticResidue(q, mQ)) {
        return mQ;
      }
    }
  }
}
