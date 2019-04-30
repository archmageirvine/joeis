package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Stirling;
import irvine.math.q.Q;

/**
 * A002547 Numerator of {n-th harmonic number <code>H(n)</code> divided by <code>(n+1)}</code>: <code>a(n) =</code> A001008(n)/A002805(n).
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
