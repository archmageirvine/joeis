package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076135 Numbers n such that O(n) = E(n)-1, where O(n), E(n) denote the number of integers k, 1 &lt;= k &lt;= n, such that Omega(n) is even or odd, respectively and Omega(n) denotes the number of prime factors of n, counting multiplicity.
 * @author Sean A. Irvine
 */
public class A076135 extends Sequence1 {

  private long mN = 906180358;
  private long mOdd = 0;

  @Override
  public Z next() {
    while (true) {
      if ((Functions.BIG_OMEGA.l(++mN) & 1) == 0) {
        --mOdd;
      } else {
        ++mOdd;
      }
      if (mOdd == -1) {
        return Z.valueOf(mN);
      }
    }
  }
}
