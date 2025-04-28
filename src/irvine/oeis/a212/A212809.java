package irvine.oeis.a212;

import irvine.oeis.a051.A051491;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A212809 Decimal expansion of radius of convergence of g.f. for unlabeled trees (A000055).
 * @author Sean A. Irvine
 */
public class A212809 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A212809() {
    super(0, new A051491().getCR().inverse());
  }
}

