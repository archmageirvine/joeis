package irvine.oeis.a031;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A031347 Multiplicative digital root of n (keep multiplying digits of n until reaching a single digit).
 * @author Sean A. Irvine
 */
public class A031347 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    while (m > 9) {
      m = Functions.DIGIT_PRODUCT.l(m);
    }
    return Z.valueOf(m);
  }
}

