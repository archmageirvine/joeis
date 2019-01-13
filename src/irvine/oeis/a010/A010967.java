package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010967.
 * @author Sean A. Irvine
 */
public class A010967 implements Sequence {

  private long mN = 13;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 14);
  }
}

