package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010988 Binomial coefficient C(n,35).
 * @author Sean A. Irvine
 */
public class A010988 implements Sequence {

  private long mN = 34;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 35);
  }
}

