package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085829 a(n) = least k such that the average number of divisors of {1..k} is &gt;= n.
 * @author Sean A. Irvine
 */
public class A085829 extends Sequence1 {

  private Z mSum = Z.ONE;
  private Z mN = Z.ZERO;
  private long mM = 1;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (mSum.compareTo(mN.multiply(mM)) < 0) {
      mSum = mSum.add(Functions.SIGMA0.z(++mM));
    }
    return Z.valueOf(mM);
  }
}
