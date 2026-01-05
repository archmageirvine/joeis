package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002378;

/**
 * A083002 Smallest oblong number having at least n distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A083002 extends Sequence1 {

  private final Sequence mS = new A002378();
  private Z mA = mS.next();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (Functions.OMEGA.i(mA) < mN) {
      mA = mS.next();
    }
    return mA;
  }
}
