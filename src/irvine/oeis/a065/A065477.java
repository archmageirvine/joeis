package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A065477 Decimal expansion of constant 5 * Pi^2 * A065476 / 48.
 * @author Sean A. Irvine
 */
public class A065477 extends A065468 {

  private static final CR C = CR.PI.square().multiply(new Q(5, 48));

  /** Construct the sequence. */
  public A065477() {
    super(new long[] {2, 1, 0}, new long[] {-2, -6, -2}, 0, C, k -> Zeta.zetap(k).subtract(CR.valueOf(new Q(Z.ONE, Z.ONE.shiftLeft(k)))));
  }
}
