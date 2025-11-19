package irvine.oeis.a140;
// manually 2025-11-15/lambdan at 2025-11-15 22:57

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.LambdaSequence;

/**
 * A140276 Floor of the (first-quadrant) angle in degrees whose tangent is n.
 * @author Georg Fischer
 */
public class A140276 extends LambdaSequence {
  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A140276() {
    super(0, n -> REALS.atan(CR.valueOf(n)).multiply(180).divide(CR.PI).floor());
  }
}
