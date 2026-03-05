package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393637 Decimal expansion of 2*sin(Pi/8)/(1+cos(Pi/8)).
 * @author Sean A. Irvine
 */
public class A393637 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393637() {
    super(0, CR.PI.divide(16).tan().multiply(2));
  }
}
