package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051195 T(2n+2,n), array T as in A050186; a count of aperiodic binary words.
 * @author Sean A. Irvine
 */
public class A051195 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z t = Binomial.binomial(2 * ++mN + 2, mN);
    return (mN & 1) == 0 ? t.subtract(Binomial.binomial(mN + 1, mN / 2)) : t;
  }
}
