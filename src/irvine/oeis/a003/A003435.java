package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A003435 Number of directed Hamiltonian circuits on n-octahedron with a marked starting node.
 * @author Sean A. Irvine
 */
public class A003435 implements Sequence {

  protected final MemoryFactorial mF = new MemoryFactorial();
  protected int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      final Z t = Binomial.binomial(mN, k)
        .multiply(2L * mN)
        .multiply(Z.ONE.shiftLeft(k))
        .multiply(mF.factorial(2 * mN - k))
        .divide(2L * mN - k);
      s = s.signedAdd((k & 1) == 0, t);
    }
    return s;
  }

}

