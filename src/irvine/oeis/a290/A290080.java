package irvine.oeis.a290;
// manually sigman1/sigma1 at 2023-02-28 22:58

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001222;

/**
 * A290080 a(1) = 0; for n &gt; 1, a(n) = sigma(bigomega(n)).
 * @author Georg Fischer
 */
public class A290080 extends A001222 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z result = Jaguar.factor(super.next()).sigma();
    return (mN == 1) ? Z.ZERO : result;
  }
}
