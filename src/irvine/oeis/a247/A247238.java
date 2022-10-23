package irvine.oeis.a247;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A247238 a(n) = Stirling2(2*n+1, n).
 * @author Georg Fischer
 */
public class A247238 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Stirling.secondKind(2 * mN + 1, mN);
  }
}
