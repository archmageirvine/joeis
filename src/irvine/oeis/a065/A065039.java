package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a054.A054899;

/**
 * A065039 If n in base 10 is d_1 d_2 ... d_k then a(n) = d_1 + d_1.d_2 + d_1.d_2.d_3 + ... + d_1. ... .d_k, where the dot means the concatenation operation.
 * @author Sean A. Irvine
 */
public class A065039 extends A054899 {

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}

