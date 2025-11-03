package irvine.oeis.a100;
// manually 2025-11-01

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.Zeta;
import irvine.oeis.LambdaSequence;

/**
 * A100594 Floor of Pi^(2*n)/Zeta(2*n).
 * @author Georg Fischer
 */
public class A100594 extends LambdaSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A100594() {
    super(1, n -> REALS.pow(CR.PI, 2 * n).divide(Zeta.zeta(2 * n)).floor());
  }
}
