package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072215 a(0) = 4; for n &gt;= 0, a(n+1) = number of partitions of a(n).
 * @author Sean A. Irvine
 */
public class A072215 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : Functions.PARTITIONS.z(mA);
    return mA;
  }
}
