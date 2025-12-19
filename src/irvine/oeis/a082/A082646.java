package irvine.oeis.a082;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A082646 Primes whose decimal expansions contain equal numbers of each of their digits.
 * @author Sean A. Irvine
 */
public class A082646 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final int[] cnts = ZUtils.digitCounts(p);
      if (IntegerUtils.isNonzeroConstant(cnts) > 0) {
        return p;
      }
    }
  }
}
