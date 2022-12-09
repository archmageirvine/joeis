package irvine.oeis.a193;
// manually anopan 

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A193678 Discriminant of Chebyshev C-polynomials.
 * @author Georg Fischer
 */
public class A193678 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    // a(n)= (2^(n-1))*n^n, n>=1.
    ++mN;
    return Z.ONE.shiftLeft(mN - 1).multiply(Z.valueOf(mN).pow(mN));
  }
}
