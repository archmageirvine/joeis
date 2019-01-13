package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006659.
 * @author Sean A. Irvine
 */
public class A006659 implements Sequence {

  long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN + 2, mN - 1).multiply2();
  }
}
