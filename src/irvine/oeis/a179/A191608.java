package irvine.oeis.a179;

import irvine.oeis.a152.A152062;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A191608 Decimal expansion of number whose continued fraction is based on noncomposite numbers.
 * @author Sean A. Irvine
 */
public class A191608 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A191608() {
    super(0, new A152062().getCR().inverse());
  }
}
