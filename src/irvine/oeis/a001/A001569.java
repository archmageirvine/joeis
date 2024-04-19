package irvine.oeis.a001;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001569 Sum_{n&gt;=0} a(n)*x^n/n!^2 = BesselI(0,2*(1-exp(x))^(1/2)).
 * @author Sean A. Irvine
 */
public class A001569 extends Sequence0 {

  private int mN = -1;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    final int n1 = ++mN;
    final Z n = Functions.FACTORIAL.z(n1);
    for (int k = 0; k <= mN; ++k) {
      final Z t = Stirling.secondKind(mN, k).multiply(n).divide(Functions.FACTORIAL.z(k));
      s = s.signedAdd((k & 1) == 0, t);
    }
    return s;
  }
}
