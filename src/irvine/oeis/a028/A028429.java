package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028429.
 * @author Sean A. Irvine
 */
public class A028429 implements Sequence {

  private static final CR BASE_LOG = CR.valueOf(8).log();
  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    final StringBuilder sb = new StringBuilder();
    while (m > 0) {
      sb.insert(0, Long.toString(m, 8));
      m = CR.valueOf(m).log().divide(BASE_LOG).floor().longValueExact();
    }
    return new Z(sb, 8);
  }
}
