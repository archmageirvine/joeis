package irvine.oeis.a099;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A099736 Decimal expansion of (log_10 Pi) / Pi.
 * @author Georg Fischer
 */
public class A099736 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A099736() {
    super(0, CR.PI.log().divide(CR.LOG10).divide(CR.PI));
  }
}
