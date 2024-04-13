package irvine.oeis.a031;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A031346 Multiplicative persistence: number of iterations of "multiply digits" needed to reach a number &lt; 10.
 * @author Sean A. Irvine
 */
public class A031346 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m > 9) {
      ++cnt;
      m = Functions.DIGIT_PRODUCT.l(m);
    }
    return Z.valueOf(cnt);
  }
}

