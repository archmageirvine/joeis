package irvine.oeis.a211;
// manually 2022-09-10

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A211791 a(n) = Sum_{y=1..n} Sum_{x=1..n} floor((x^k + y^k)^(1/k)) with k = 2.
 * @author Georg Fischer
 */
public class A211791 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int x = 1; x <= mN; ++x) {
      for (int y = 1; y <= mN; ++y) {
        sum = sum.add(Functions.SQRT.l((long) x * x + (long) y * y));
      }
    }
    return sum;
  }
}
