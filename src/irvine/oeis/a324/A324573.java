package irvine.oeis.a324;
// manually sigman1/sigma1 at 2023-02-28 22:58

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a048.A048675;

/**
 * A324573 a(1) = 0; for n &gt; 1, a(n) = sigma(A048675(n)).
 * @author Georg Fischer
 */
public class A324573 extends A048675 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z result = Jaguar.factor(super.next()).sigma();
    return (++mN == 1) ? Z.ZERO : result;
  }
}
