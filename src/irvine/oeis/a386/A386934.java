package irvine.oeis.a386;

import irvine.oeis.a363.A363679;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A075838 Decimal expansion of the solution to the donkey problem.
 * @author Sean A. Irvine
 */
public class A386934 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A386934() {
    super(0, new A363679().getCR().divide(new A386710().getCR()));
  }
}
