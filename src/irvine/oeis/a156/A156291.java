package irvine.oeis.a156;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A156291 Triangle read by rows: T(n,m) = Product_{k=1..n} Phi(k, m+1) where Phi(k,m) is the k-th cyclotomic polynomial evaluated at m.
 * @author Sean A. Irvine
 */
public class A156291 extends Sequence1 {

  private int mN = 1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Integers.SINGLETON.product(1, mN, k -> Functions.CYCLOTOMIC.z(k, mM + 1));
  }
}
