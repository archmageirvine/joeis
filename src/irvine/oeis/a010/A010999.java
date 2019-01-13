package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010999.
 * @author Sean A. Irvine
 */
public class A010999 implements Sequence {

  private long mN = 45;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 46);
  }
}

