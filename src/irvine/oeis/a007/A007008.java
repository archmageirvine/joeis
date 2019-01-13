package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007008.
 * @author Sean A. Irvine
 */
public class A007008 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN - 2).subtract(Binomial.binomial(mN - 1, (mN - 1) / 2).divide2());
  }
}

