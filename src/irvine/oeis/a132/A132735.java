package irvine.oeis.a132;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A132735 Triangle T(n,k) = binomial(n,k) + 1 with T(n,0) = T(n,n) = 1, read by rows.
 * @author Georg Fischer
 */
public class A132735 extends Triangle {

  @Override
  public Z next() {
    return super.next().add(mCol == 0 || mCol == mRow ? 0 : 1);
  }
}
