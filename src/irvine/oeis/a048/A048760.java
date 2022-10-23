package irvine.oeis.a048;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048760 Largest square &lt;= n.
 * @author Sean A. Irvine
 */
public class A048760 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long s = LongUtils.sqrt(++mN);
    return Z.valueOf(s * s);
  }
}
