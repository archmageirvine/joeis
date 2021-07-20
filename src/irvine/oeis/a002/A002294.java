package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002294 a(n) = binomial(5*n, n)/(4*n + 1).
 * @author Sean A. Irvine
 */
public class A002294 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(5 * mN, mN).divide(4 * mN + 1);
  }
}
