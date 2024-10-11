package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048389 Primes resulting from procedure described in A048388.
 * @author Sean A. Irvine
 */
public class A048389 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final StringBuilder sb = new StringBuilder();
      long m = ++mN;
      do {
        sb.append(A048385.EXPANSIONS[(int) (m % 10)]);
        m /= 10;
      } while (m != 0);
      final Z result = new Z(sb.reverse());
      if (result.isProbablePrime()) {
        return result;
      }
    }
  }
}
