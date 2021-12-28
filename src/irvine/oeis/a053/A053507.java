package irvine.oeis.a053;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053507 a(n) = binomial(n-1,2)*n^(n-3).
 * @author Sean A. Irvine
 */
public class A053507 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(mN++, 2).multiply(Z.valueOf(mN).pow(mN - 3));
  }
}

