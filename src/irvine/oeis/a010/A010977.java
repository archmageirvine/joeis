package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010977.
 * @author Sean A. Irvine
 */
public class A010977 implements Sequence {

  private long mN = 23;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 24);
  }
}

