package irvine.oeis.a130;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A130310 Minimal (or "greedy") Lucas representation of n, in which L(0) = 2 and L(2) = 3 are not allowed in the same representation (hence the correct representation of the integer 5 is 1010 rather than 101). A binary system of integers with Lucas numbers (A000032) as a base.
 * @author Sean A. Irvine
 */
public class A130310 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long m = mN;
    int k = 1;
    Z result = Z.ZERO;
    while (m > 0) {
      if (m == 1) {
        k = 1;
        result = result.setBit(k);
        m = 0;
      } else if (m == 2) {
        k = 0;
        result = result.setBit(k);
        m = 0;
      } else {
        while (Functions.LUCAS.l(k) <= m) {
          ++k;
        }
        --k;
        result = result.setBit(k);
        m -= Functions.LUCAS.l(k);
        k = 1;
      }
    }
    return new Z(result.toString(2));
  }
}
