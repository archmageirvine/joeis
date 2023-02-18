package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061465 a(n) = floor(Sum_{k=1..n} sqrt(2k-1)).
 * @author Sean A. Irvine
 */
public class A061465 extends Sequence1 {

  private CR mA = CR.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    mA = mA.add(CR.valueOf(mN).sqrt());
    return mA.floor();
  }
}

