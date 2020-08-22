package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028424 Clog sequence in base 3. Right to left concatenation of n,int(log_3(n)),int(log_3(int(log_3(n)))),... in base 3.
 * @author Sean A. Irvine
 */
public class A028424 implements Sequence {

  private static final CR BASE_LOG = CR.THREE.log();
  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    final StringBuilder sb = new StringBuilder();
    while (m > 0) {
      sb.insert(0, Long.toString(m, 3));
      m = CR.valueOf(m).log().divide(BASE_LOG).floor().longValueExact();
    }
    return new Z(sb, 3);
  }
}
