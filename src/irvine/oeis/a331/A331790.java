package irvine.oeis.a331;

import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.a264.A264808;

/**
 * A331790 Decimal expansion of the solution to x*e^(x*e^(x))=1.
 * @author Sean A. Irvine
 */
public class A331790 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A331790() {
    super(new A264808().getCR().log());
  }
}

