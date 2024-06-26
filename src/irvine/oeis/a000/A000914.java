package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000914 Stirling numbers of the first kind: s(n+2, n).
 * @author Sean A. Irvine
 */
public class A000914 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.STIRLING1.z(mN + 2, mN);
  }
}

