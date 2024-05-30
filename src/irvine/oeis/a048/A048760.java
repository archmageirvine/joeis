package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048760 Largest square &lt;= n.
 * @author Sean A. Irvine
 */
public class A048760 extends Sequence0 {

  protected long mN = -1;

  @Override
  public Z next() {
    final long n = ++mN;
    final long s = Functions.SQRT.l(n);
    return Z.valueOf(s * s);
  }
}
