package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011843.
 * @author Sean A. Irvine
 */
public class A011843 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 6).divide(mN);
  }
}

