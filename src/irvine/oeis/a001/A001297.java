package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001297 Stirling numbers of the second kind S(n+3, n).
 * @author Sean A. Irvine
 */
public class A001297 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.STIRLING2.z(mN + 3, mN);
  }
}
