package irvine.oeis.a127;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A127945 Hankel transform of central coefficients of (1+k*x-2x^2)^n, k arbitrary integer.
 * a(n) = 2^n*(-2)^C(n+1, 2).
 * @author Georg Fischer
 */
public class A127945 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).multiply(Z.valueOf(-2).pow(Binomial.binomial(mN + 1, 2)));
  }
}
