package irvine.oeis.a047;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A047742 A discrete analog of Li(n): a(n) = ceiling(Sum_{k=2..n} 1/log(k)).
 * @author Sean A. Irvine
 */
public class A047742 extends Sequence2 {

  private long mN = 1;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(CR.valueOf(++mN).log().inverse());
    return mSum.ceil();
  }
}
