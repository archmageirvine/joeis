package irvine.oeis.a137;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A137337 T(i,j) = (i+1)*binomial(i,j)*2^(i-j)*4^j.
 * @author Georg Fischer
 */
public class A137337 extends Triangle {

  /** Construct the sequence. */
  public A137337() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int i, final int j) {
    return Binomial.binomial(i, j).multiply(i + 1).multiply((((i + j) & 1) == 0) ? Z.ONE : Z.NEG_ONE).multiply(Z.ONE.shiftLeft(i - j)).multiply(Z.ONE.shiftLeft(2 * j));
  }
}
