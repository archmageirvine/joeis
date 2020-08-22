package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010985 Binomial coefficient C(n,32).
 * @author Sean A. Irvine
 */
public class A010985 implements Sequence {

  private long mN = 31;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 32);
  }
}

