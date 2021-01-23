package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036377 Floor[concatenation of seven consecutive numbers from n to n+6 divided by 7].
 * @author Sean A. Irvine
 */
public class A036377 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k <= 6; ++k) {
      sb.append(mN + k);
    }
    return new Z(sb).divide(7);
  }
}
