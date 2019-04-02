package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010995 Binomial coefficient C(n,42).
 * @author Sean A. Irvine
 */
public class A010995 implements Sequence {

  private long mN = 41;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 42);
  }
}

