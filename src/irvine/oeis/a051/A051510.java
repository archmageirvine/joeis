package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051510 a(n) = ceiling(Sum_{k=0..n} tan(k)).
 * @author Sean A. Irvine
 */
public class A051510 extends Sequence0 {

  private CR mSum = CR.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mSum = mSum.add(ComputableReals.SINGLETON.tan(CR.valueOf(++mN)));
    return mSum.ceil();
  }
}

