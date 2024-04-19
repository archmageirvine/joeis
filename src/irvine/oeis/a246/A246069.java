package irvine.oeis.a246;

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A246069 Number of maximal classes determined by permutations.
 * @author Sean A. Irvine
 */
public class A246069 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    final int n = ++mN;
    final Z nf = Functions.FACTORIAL.z(n);
    Z s = Z.ZERO;
    for (final Z p : Jaguar.factor(mN).toZArray()) {
      final int m = mN / p.intValueExact();
      s = s.add(nf.divide(p.pow(m).multiply(p.subtract(1)).multiply(Functions.FACTORIAL.z(m))));
    }
    return s;
  }
}
