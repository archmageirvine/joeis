package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075565.
 * @author Sean A. Irvine
 */
public class A075794 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private long mN = 0;
  private long mK = 0;

  @Override
  public Z next() {
    mSum = mSum.add(Functions.PHI.l(++mN));
    while (Functions.PHI.z(++mK).compareTo(mSum) <= 0) {
      // do nothing
    }
    return Z.valueOf(mK);
  }
}

