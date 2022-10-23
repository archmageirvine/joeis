package irvine.oeis.a056;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A056690 a(n) = floor(product_{k=2..n} log(k)).
 * @author Sean A. Irvine
 */
public class A056690 extends Sequence2 {

  private long mN = 1;
  private CR mSum = CR.ONE;

  @Override
  public Z next() {
    mSum = mSum.multiply(CR.valueOf(++mN).log());
    return mSum.floor();
  }
}
