package irvine.oeis.a257;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A257407 Decimal expansion of E(1/sqrt(2)) = 1.35064..., where E is the complete elliptic integral.
 * @author Georg Fischer
 */
public class A257407 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A257407() {
    super(1, CR.SQRT2.inverse().ellipticE());
  }
}
