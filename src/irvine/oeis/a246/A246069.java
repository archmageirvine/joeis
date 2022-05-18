package irvine.oeis.a246;

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A246069 Number of maximal classes determined by permutations.
 * @author Sean A. Irvine
 */
public class A246069 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    final Z nf = mF.factorial(++mN);
    Z s = Z.ZERO;
    for (final Z p : Jaguar.factor(mN).toZArray()) {
      final int m = mN / p.intValueExact();
      s = s.add(nf.divide(p.pow(m).multiply(p.subtract(1)).multiply(mF.factorial(m))));
    }
    return s;
  }
}
