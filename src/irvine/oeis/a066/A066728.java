package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066728 a(n) is the number of integers of the form (n+k+n*k)/(n-k) for k = 1,2,...,n-1.
 * @author Sean A. Irvine
 */
public class A066728 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN * (mN + 2)).sigma0().add(1).divide2().subtract(1);
  }
}
