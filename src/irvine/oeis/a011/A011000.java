package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011000.
 * @author Sean A. Irvine
 */
public class A011000 implements Sequence {

  private long mN = 46;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 47);
  }
}

