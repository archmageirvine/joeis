package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048376 Replace each 1 in decimal expansion of n with 1 1's, each 2 with 2 2's, etc. (0 vanishes).
 * @author Sean A. Irvine
 */
public class A048376 implements Sequence {

  private static final String[] EXPANSIONS = {
    "",
    "1",
    "22",
    "333",
    "4444",
    "55555",
    "666666",
    "7777777",
    "88888888",
    "999999999"
  };
  private long mN = 0;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    long m = ++mN;
    while (m != 0) {
      sb.append(EXPANSIONS[(int) (m % 10)]);
      m /= 10;
    }
    return new Z(sb.reverse());
  }
}
