package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048383 Numbers k such that replacing each nonzero digit d with the d-th prime (replacing each 0 digit with a 1) yields a square.
 * @author Sean A. Irvine
 */
public class A048383 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final StringBuilder sb = new StringBuilder();
      long m = ++mN;
      do {
        sb.append(A048380.EXPANSIONS[(int) (m % 10)]);
        m /= 10;
      } while (m != 0);
      if (new Z(sb.reverse()).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
