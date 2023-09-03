package irvine.oeis.a065;

import irvine.math.cr.CR;

/**
 * A065464 Decimal expansion of Product_{p prime}(1 - (2*p-1)/p^3).
 * @author Sean A. Irvine
 */
public class A065464 extends A065468 {

  /** Construct the sequence. */
  public A065464() {
    super(new long[] {1, 0, -2}, new long[] {-2, 3, -6}, 0, CR.SIX.divide(CR.PI.square()));
  }
}
