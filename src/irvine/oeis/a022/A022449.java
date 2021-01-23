package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a008.A008578;

/**
 * A022449 c(p(n)) where p(k) is k-th prime including p(1)=1 and c(k) is k-th composite number.
 * @author Sean A. Irvine
 */
public class A022449 extends A008578 {

  private final Sequence mComposites = new A002808();
  private long mN = 0;

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    while (++mN < p) {
      mComposites.next();
    }
    return mComposites.next();
  }
}
