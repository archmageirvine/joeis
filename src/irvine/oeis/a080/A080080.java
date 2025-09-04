package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a050.A050600;

/**
 * A080080 T(n,k) = length of longest carry sequence when adding k to n in binary representation, 1 &lt;= k &lt;= n (triangular array).
 * @author Sean A. Irvine
 */
public class A080080 extends Sequence1 {

  private final A050600 mA = new A050600();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mA.get(mN, mM)).subtract(1);
  }
}

