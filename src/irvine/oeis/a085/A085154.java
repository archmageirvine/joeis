package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085154 a(n+1) = smallest number &gt;a(n) having more prime factors than a(n), with or without repetitions; a(1)=1.
 * @author Sean A. Irvine
 */
public class A085154 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final int omega = Functions.OMEGA.i(mA);
      final int bigOmega = Functions.BIG_OMEGA.i(mA);
      do {
        mA = mA.add(1);
      } while (Functions.BIG_OMEGA.i(mA) <= bigOmega && Functions.OMEGA.i(mA) <= omega);
    }
    return mA;
  }
}
