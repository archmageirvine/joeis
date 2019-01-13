package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010979.
 * @author Sean A. Irvine
 */
public class A010979 implements Sequence {

  private long mN = 25;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 26);
  }
}

