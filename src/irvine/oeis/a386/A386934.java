package irvine.oeis.a386;

import irvine.oeis.a363.A363679;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A386934 Decimal expansion of BesselI(1, 2*sqrt(2))/(sqrt(2)*BesselI(2, 2*sqrt(2))).
 * @author Sean A. Irvine
 */
public class A386934 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A386934() {
    super(0, new A363679().getCR().divide(new A386710().getCR()));
  }
}
