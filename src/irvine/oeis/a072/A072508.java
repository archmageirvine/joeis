package irvine.oeis.a072;

import irvine.oeis.a088.A088751;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A072508 Decimal expansion of Backhouse constant.
 * @author Sean A. Irvine
 */
public class A072508 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A072508() {
    super(1, new A088751().getCR().inverse());
  }
}
