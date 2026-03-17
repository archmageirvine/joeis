package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A084246 Decimal expansion of c = Product_{k&gt;=1} (1 + 8/k^3).
 * @author Sean A. Irvine
 */
public class A084246 extends DecimalExpansionSequence {

  private static final CR S = CR.THREE.sqrt().multiply(CR.PI);

  /** Construct the sequence. */
  public A084246() {
    super(2, S.sinh().multiply(3).divide(S.multiply(2)));
  }
}
