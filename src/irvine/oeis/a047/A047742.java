package irvine.oeis.a047;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047742 A discrete analog of Li(n): ceiling(Sum_{k=2..n} 1/log(k)).
 * @author Sean A. Irvine
 */
public class A047742 implements Sequence {

  private long mN = 1;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(CR.valueOf(++mN).log().inverse());
    return mSum.ceil();
  }
}
