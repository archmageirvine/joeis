package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010987.
 * @author Sean A. Irvine
 */
public class A010987 implements Sequence {

  private long mN = 33;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 34);
  }
}

