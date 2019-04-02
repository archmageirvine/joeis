package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010989 Binomial coefficient C(n,36).
 * @author Sean A. Irvine
 */
public class A010989 implements Sequence {

  private long mN = 35;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 36);
  }
}

