package irvine.oeis.a191;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a003.A003657;

/**
 * A191410 Class number, k, of n, i.e.; imaginary quadratic fields negated Q(sqrt(-n))=k, or 0 if n is not a fundamental discriminant (A003657).
 * @author Sean A. Irvine
 */
public class A191410 extends A003657 {

  private long mN = 0;
  private long mM = super.next().longValueExact();

  @Override
  public Z next() {
    if (++mN != mM) {
      return Z.ZERO;
    }
    mM = super.next().longValueExact();
    return Z.valueOf(LongUtils.hurwitzClassNumber(-mN));
  }
}

