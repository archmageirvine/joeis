package irvine.oeis.a091;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A091725 Decimal expansion of second exponential integral at 1, ExpIntegralEi[1].
 * @author Sean A. Irvine
 */
public class A091725 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A091725() {
    super(CR.ONE.ei());
  }
}
