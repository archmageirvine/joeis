package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074634 Cototient-remainder triangle: triangular array T(n,k) (n &gt;= 1, 0 &lt;= k &lt; n) read by rows, where T(n,k) = smallest number x such that cototient(x) mod n = k.
 * @author Sean A. Irvine
 */
public class A074634 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    long k = 0;
    final long m = mM % mN;
    while (true) {
      if (Functions.COTOTIENT.z(++k).mod(mN) == m) {
        return Z.valueOf(k);
      }
    }
  }
}
