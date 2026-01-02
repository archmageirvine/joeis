package irvine.oeis.a359;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a008.A008619;

/**
 * A359979 Irregular table T(n,k), n &gt;= 0 and k &gt;= 0, read by rows with T(n + 3*k,k) = A008619(n).
 * @author Sean A. Irvine
 */
public class A359979 extends Sequence0 {

  private final DirectSequence mA = DirectSequence.create(new A008619());
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (3 * ++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mA.a(mN - 3 * mM);
  }
}
