package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393243 Decimal expansion of the limit mean of the number of continued fraction coefficients required per decimal digit for the silver ratio.
 * @author Sean A. Irvine
 */
public class A393243 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393243() {
    super(1, CR.SQRT2.add(1).log10().multiply(2).inverse());
  }
}

