package irvine.oeis.a334;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A334422 Decimal expansion of Pi/128.
 * @author Georg Fischer
 */
public class A334422 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A334422() {
    super(-1, CR.PI.divide(CR.valueOf(128)));
  }
}
