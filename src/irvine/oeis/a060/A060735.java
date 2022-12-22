package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060735 a(1)=1, a(2)=2; thereafter, a(n) is the smallest number m not yet in the sequence such that every prime that divides a(n-1) also divides m.
 * @author Sean A. Irvine
 */
public class A060735 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(Jaguar.factor(mA).squareFreeKernel());
    return mA;
  }
}
