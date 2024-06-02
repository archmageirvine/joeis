package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070172 Smallest k such that sigma(k) &gt;= n.
 * @author Sean A. Irvine
 */
public class A070172 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (Functions.SIGMA.l(mM) < mN) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
