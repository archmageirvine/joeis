package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024919 a(n) = Sum_{k=1..n} (-1)^k*k*floor(n/k).
 * @author Sean A. Irvine
 */
public class A024919 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.NEG_ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      long m = mN;
      long l = 2;
      while ((m & 1) == 0) {
        m >>>= 1;
        l <<= 1;
      }
      mA = mA.add(Functions.SIGMA.z(m).multiply(l - 3));
    }
    return mA;
  }
}
