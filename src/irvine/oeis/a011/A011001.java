package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011001.
 * @author Sean A. Irvine
 */
public class A011001 implements Sequence {

  private long mN = 47;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 48);
  }
}

