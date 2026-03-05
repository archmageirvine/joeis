package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393636 Decimal expansion of 2*cos(Pi/8)/(1+cos(Pi/8)).
 * @author Sean A. Irvine
 */
public class A393636 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393636() {
    super(0, CR.TWO.divide(CR.TWO.divide(CR.SQRT2.add(2).sqrt()).add(1)));
  }
}
