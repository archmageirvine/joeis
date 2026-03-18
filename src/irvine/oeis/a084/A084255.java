package irvine.oeis.a084;

import irvine.oeis.a064.A064442;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A084255 Decimal expansion of continued fraction 1/(2+1/(3+1/(5+1/(7+1/(11+...))))).
 * @author Sean A. Irvine
 */
public class A084255 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A084255() {
    super(0, new A064442().getCR().inverse());
  }
}
