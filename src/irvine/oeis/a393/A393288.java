package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393288 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A393288 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393288() {
    super(1, CR.E.add(1).subtract(CR.GAMMA));
  }
}
