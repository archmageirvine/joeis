package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A385734 Lucas triangle A385732/A385733 mod 2..
 * @author Georg Fischer
 */
public class A385734 extends A385732 {

  @Override
  protected Z compute(final int n, final int k) {
    final Q fr = super.computeQ(n, k);
    return !Functions.GCD.z(fr.den(), Z.TWO).equals(Z.ONE) ? Z.NEG_ONE : fr.num().and(Z.ONE);
  }
}
