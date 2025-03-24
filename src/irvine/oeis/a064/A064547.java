package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A064547 Sum of binary digits (or count of 1-bits) in the exponents of the prime factorization of n.
 * @author Georg Fischer
 */
public class A064547 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z a(final Z n) {
    return Z.valueOf(Functions.INFINITARY_SIGMA0.z(n).bitLength() - 1);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(Functions.INFINITARY_SIGMA0.z(n).bitLength() - 1);
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
