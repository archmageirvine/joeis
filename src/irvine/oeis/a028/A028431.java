package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028431.
 * @author Sean A. Irvine
 */
public class A028431 implements Sequence {

  private static final CR BASE_LOG = CR.valueOf(10).log();
  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    final StringBuilder sb = new StringBuilder();
    while (m > 0) {
      sb.insert(0, m);
      m = CR.valueOf(m).log().divide(BASE_LOG).floor().longValueExact();
    }
    return new Z(sb);
  }
}
