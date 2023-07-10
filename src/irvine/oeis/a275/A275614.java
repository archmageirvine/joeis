package irvine.oeis.a275;

import irvine.oeis.a214.A214070;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A275614 Decimal expansion of number with continued fraction expansion 1, 2, 4, 8, 16, 32, ... (powers of 2).
 * @author Sean A. Irvine
 */
public class A275614 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A275614() {
    super(0, new A214070().getCR().inverse());
  }
}
