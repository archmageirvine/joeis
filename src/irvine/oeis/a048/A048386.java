package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048386 Numbers n such that replacing digits d in decimal expansion of n with d^2 yields a square.
 * @author Sean A. Irvine
 */
public class A048386 extends Sequence1 {

  static final String[] EXPANSIONS = {
    "0",
    "1",
    "4",
    "9",
    "61", // we do a reverse later!
    "52",
    "63",
    "94",
    "46",
    "18"
  };
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final StringBuilder sb = new StringBuilder();
      long m = ++mN;
      do {
        sb.append(EXPANSIONS[(int) (m % 10)]);
        m /= 10;
      } while (m != 0);
      if (new Z(sb.reverse()).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
