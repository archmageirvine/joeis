package irvine.oeis.a065;

import irvine.math.cr.CR;

/**
 * A065484 Decimal expansion of Product_{p prime &gt;= 2} (1 + p/((p-1)^2*(p+1))).
 * @author Sean A. Irvine
 */
public class A065484 extends A065468 {

  /** Construct the sequence. */
  public A065484() {
    super(new long[] {1, -1, -1, 2}, new long[] {3, 4, 5, 3}, 1, CR.PI.square().divide(CR.SIX));
  }
}
