package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069572 Smallest n-digit number in which the k-th digit (from the right!) is a divisor of k, greater than 1 unless k has no single-digit divisor &gt; 1.
 * @author Sean A. Irvine
 */
public class A069572 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ZERO;
  private Z mM = Z.ONE;

  @Override
  public Z next() {
    final long lpf = Functions.LPF.l(++mN);
    mA = mA.add(mM.multiply(lpf < 10 ? lpf : 1));
    mM = mM.multiply(10);
    return mA;
  }
}
