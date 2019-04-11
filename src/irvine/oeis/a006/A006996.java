package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006996 C(2n,n) <code>mod 3</code>.
 * @author Sean A. Irvine
 */
public class A006996 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(Binomial.binomial(2 * mN, mN, 3));
  }
}
