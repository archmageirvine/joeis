package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005817.
 * @author Sean A. Irvine
 */
public class A005817 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.catalan((mN + 1) / 2).multiply(Binomial.catalan(mN / 2 + 1));
  }
}
