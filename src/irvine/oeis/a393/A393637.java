package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393637 allocated for Stanislav Sykora.
 * @author Sean A. Irvine
 */
public class A393637 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393637() {
    super(0, CR.PI.divide(16).tan().multiply(2));
  }
}
