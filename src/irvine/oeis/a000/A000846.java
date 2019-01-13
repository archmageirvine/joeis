package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000846.
 * @author Sean A. Irvine
 */
public class A000846 implements Sequence {

  private int mN = -1;
  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(3 * mN, mN).subtract(Binomial.binomial(2 * mN, mN));
  }
}

