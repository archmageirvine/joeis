package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010986 Binomial coefficient C(n,33).
 * @author Sean A. Irvine
 */
public class A010986 implements Sequence {

  private long mN = 32;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 33);
  }
}

