package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Stirling;
import irvine.math.q.Q;

/**
 * A002547 Numerator of the n-th harmonic number <code>H(n)</code> divided by <code>(n+1); a(n) = A001008(n) / ((n+1)*A002805(n))</code>.
 * @author Sean A. Irvine
 */
public class A002547 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  protected Q step() {
    ++mN;
    mF = mF.multiply(mN + 2);
    return new Q(Stirling.firstKind(mN + 2, 2).multiply2(), mF).abs();
  }

  @Override
  public Z next() {
    return step().num();
  }
}
