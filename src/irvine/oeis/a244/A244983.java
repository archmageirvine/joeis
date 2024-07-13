package irvine.oeis.a244;
// manually 2024-07-12

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a070.A070003;
import irvine.oeis.a122.A122111;

/**
 * A244983 Permutation of natural numbers: a(1) = 1, a(n) = (1 + A122111(A070003(n-1))) / 2.
 * @author Georg Fischer
 */
public class A244983 extends A070003 {

  private static final DirectSequence A122111 = new A122111();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return A122111.a(super.next()).add(1).divide2();
  }
}
