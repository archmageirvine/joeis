package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a006.A006753;

/**
 * A063844 Smith numbers which are also base-2 pseudoprimes.
 * @author Sean A. Irvine
 */
public class A063844 extends A006753 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isProbablePrime() && Z.TWO.modPow(t.subtract(1), t).equals(Z.ONE)) {
        return t;
      }
    }
  }
}
