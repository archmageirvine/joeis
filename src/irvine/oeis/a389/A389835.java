package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389835 Numbers k such that wt(Fibonacci(k)) * e &gt; k, where wt(x) is the binary weight of x (A000120), and e is the natural logarithm base.
 * @author Sean A. Irvine
 */
public class A389835 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (CR.E.multiply(Functions.FIBONACCI.z(++mN).bitCount()).compareTo(CR.valueOf(mN)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
