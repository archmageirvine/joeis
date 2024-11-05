package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072895 Least k for the Theodorus spiral to complete n revolutions.
 * @author Sean A. Irvine
 */
public class A072895 extends Sequence1 {

  private long mN = 0;
  private CR mSum = CR.ZERO;
  private long mM = 0;

  @Override
  public Z next() {
    final CR t = CR.TAU.multiply(++mN);
    while (mSum.compareTo(t) <= 0) {
      mSum = mSum.add(ComputableReals.SINGLETON.atan(CR.valueOf(++mM).sqrt().inverse()));
    }
    return Z.valueOf(mM);
  }
}

