package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010969.
 * @author Sean A. Irvine
 */
public class A010969 implements Sequence {

  private long mN = 15;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 16);
  }
}

