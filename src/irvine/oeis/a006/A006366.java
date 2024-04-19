package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006366 Number of cyclically symmetric plane partitions in the n-cube; also number of 2n X 2n half-turn symmetric alternating sign matrices divided by number of n X n alternating sign matrices.
 * @author Sean A. Irvine
 */
public class A006366 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (int k = 0; k < mN; ++k) {
      prod = prod.multiply(3L * k + 2).multiply(Functions.FACTORIAL.z(3 * k)).divide(Functions.FACTORIAL.z(mN + k));
    }
    return prod.toZ();
  }
}

