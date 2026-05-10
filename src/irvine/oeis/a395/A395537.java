package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395537 Decimal expansion of the sum of the reciprocals of hexagonal polygorials A000680.
 * @author Sean A. Irvine
 */
public class A395537 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395537() {
    super(1, CR.SQRT2.cosh());
  }
}
