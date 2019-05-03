package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006366 Number of cyclically symmetric plane partitions in the <code>n-cube</code>; also number of <code>2n X 2n half-turn</code> symmetric alternating sign matrices divided by number of <code>n X n</code> alternating sign matrices.
 * @author Sean A. Irvine
 */
public class A006366 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (int k = 0; k < mN; ++k) {
      prod = prod.multiply(3 * k + 2).multiply(mF.factorial(3 * k)).divide(mF.factorial(mN + k));
    }
    return prod.toZ();
  }
}

