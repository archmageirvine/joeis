package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005425;

/**
 * A085483 Triangle read by rows: S_B(n,k) = "Type B" Stirling numbers of the second kind.
 * @author Sean A. Irvine
 */
public class A085483 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final DirectSequence mF = DirectSequence.create(new A005425());

  private Z t(final int n, final int k) {
    return mF.a(k).multiply(Functions.STIRLING2.z(n, k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
