package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393413 Decimal expansion of the limit mean of the number of continued fraction coefficients required per decimal digit for the bronze ratio.
 * @author Sean A. Irvine
 */
public class A393413 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393413() {
    super(0, CR.valueOf(13).sqrt().add(3).divide(2).log10().multiply(2).inverse());
  }
}
