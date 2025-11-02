package irvine.oeis.a309;
// manually 2025-11-01

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A309946 Decimal expansion of Pi^n/Zeta(n).
 * @author Georg Fischer
 */
public class A309946 extends LambdaSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A309946() {
    super(1, n -> n == 1 ? Z.ZERO : (n == 4 ? Z.valueOf(90) : REALS.pow(CR.PI, n).divide(Zeta.zeta(n)).floor()));
  }
}
