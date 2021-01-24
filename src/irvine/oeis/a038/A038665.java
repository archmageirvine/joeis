package irvine.oeis.a038;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038665 Convolution of A007054 (super ballot numbers) with A000984 (central binomial coefficients).
 * @author Sean A. Irvine
 */
public class A038665 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.catalan(++mN).multiply(mN + 2);
  }
}

