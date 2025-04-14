package irvine.oeis.a354;

import irvine.oeis.a019.A019913;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A354128 Decimal expansion of 7 - 4*sqrt(3).
 * @author Georg Fischer
 */
public class A354128 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A354128() {
    super(0, new A019913().getCR().square());
  }
}
