package irvine.oeis.a173;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a073.A073053;

/**
 * A173578 a(n) = a(n-1) + A073053(a(n-1)).
 * @author Georg Fischer
 */
public class A173578 extends Sequence1 {

  private Z mA; // a(n)
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mA = (mN == 1) ? Z.ONE : mA.add(A073053.deneat(mA));
    return mA;
  }
}
