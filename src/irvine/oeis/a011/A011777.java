package irvine.oeis.a011;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011777 <code>a(n) =</code> least <code>k&gt;1</code> such that <code>k^n</code> divides <code>k!</code>.
 * @author Sean A. Irvine
 */
public class A011777 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z k = Z.TWO;
    while (true) {
      final Z q = k.pow(mN);
      final int ki = k.intValueExact();
      if (Z.ZERO.equals(mF.factorial(ki).mod(q))
        && !Z.ZERO.equals(mF.factorial(ki).mod(q.multiply(k)))) {
        return k;
      }
      k = k.add(1);
    }
  }
}
