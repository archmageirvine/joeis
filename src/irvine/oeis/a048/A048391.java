package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048391 Replacing digits d in decimal expansion of n with d^3 yields a square.
 * @author Sean A. Irvine
 */
public class A048391 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final StringBuilder sb = new StringBuilder();
      long m = ++mN;
      do {
        sb.append(A048390.EXPANSIONS[(int) (m % 10)]);
        m /= 10;
      } while (m != 0);
      if (new Z(sb.reverse()).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
