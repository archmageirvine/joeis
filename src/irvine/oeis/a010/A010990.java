package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010990 Binomial coefficient C(n,37).
 * @author Sean A. Irvine
 */
public class A010990 implements Sequence {

  private long mN = 36;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 37);
  }
}

