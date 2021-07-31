package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049413 Highest prime dividing sum{k=0 to n}[ k!(n-k)! ].
 * @author Sean A. Irvine
 */
public class A049413 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(mF.factorial(k).multiply(mF.factorial(mN - k)));
    }
    final Z[] p = Jaguar.factor(sum).toZArray();
    return p[p.length - 1];
  }
}
