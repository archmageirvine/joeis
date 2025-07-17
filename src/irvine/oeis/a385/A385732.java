package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A385732 Triangle read by rows: the numerators of the Lucas triangle.
 * @author Georg Fischer
 */
public class A385732 extends Triangle {

  /** Construct the sequence. */
  public A385732() {
    hasRAM(true);
  }

  protected Q computeQ(final int n, final int k) {
    if (k == 0 || k == n) {
      return Q.ONE;
    }
    // use A000204: Lucas beginning with 1
    return new Q(Integers.SINGLETON.product(n - k + 1, n, j -> j == 1 ? Z.ONE : Functions.LUCAS.z(j)),
      Integers.SINGLETON.product(1, k, j -> j == 1 ? Z.ONE : Functions.LUCAS.z(j)));
  }

  @Override
  protected Z compute(final int n, final int k) {
    return computeQ(n, k).num();
  }
}
