package irvine.oeis.a348;


import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A348856 a(n) = Sum_{d|n} (Stirling2(n,d) mod 2).
 * @author Georg Fischer
 */
public class A348856 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Stirling.secondKind(mN, d).mod(Z.TWO));
  }
}
