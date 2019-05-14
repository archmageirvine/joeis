package irvine.oeis.a307;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A307877 <code>a(n) =</code> smallest m <code>&gt;= 0</code> such that n divides <code>m+10</code>.
 * @author Sean A. Irvine
 */
public class A307877 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((++mN - 10 % mN) % mN);
  }
}
