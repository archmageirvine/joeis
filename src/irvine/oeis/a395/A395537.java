package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395537 allocated for Kelvin Voskuijl.
 * @author Sean A. Irvine
 */
public class A395537 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395537() {
    super(1, CR.SQRT2.cosh());
  }
}
