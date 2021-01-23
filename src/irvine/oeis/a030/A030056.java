package irvine.oeis.a030;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030056 C(2n+1,n-6).
 * @author Sean A. Irvine
 */
public class A030056 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN + 1, mN - 6);
  }
}
