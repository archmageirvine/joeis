package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048377 Append d digits d after each digit d in decimal expansion of n.
 * @author Sean A. Irvine
 */
public class A048377 extends Sequence0 {

  private static final String[] EXPANSIONS = {
    "0",
    "11",
    "222",
    "3333",
    "44444",
    "555555",
    "6666666",
    "77777777",
    "888888888",
    "9999999999"
  };
  private long mN = -1;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    long m = ++mN;
    do {
      sb.append(EXPANSIONS[(int) (m % 10)]);
      m /= 10;
    } while (m != 0);
    return new Z(sb.reverse());
  }
}
