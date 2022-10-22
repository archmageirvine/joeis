package irvine.oeis.a211;
// manually 2022-09-10

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A211792 a(n) = Sum_{y=1..n} Sum_{x=1..n} floor((x^k + y^k)^(1/k)) with k = 3.
 * @author Georg Fischer
 */
public class A211792 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int x = 1; x <= mN; ++x) {
      for (int y = 1; y <= mN; ++y) {
        sum = sum.add(Z.valueOf(x).pow(3).add(Z.valueOf(y).pow(3)).root(3));
      }
    }
    return sum;
  }
}
