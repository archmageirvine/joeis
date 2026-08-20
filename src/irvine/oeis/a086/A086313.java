package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.oeis.a048.A048651;
import irvine.oeis.a065.A065442;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086313 Decimal expansion of constant c appearing in the expected number of pair of twin vacancies in a digital tree.
 * @author Sean A. Irvine
 */
public class A086313 extends DecimalExpansionSequence {

  private static final CR ALPHA = new A065442().getCR();

  /** Construct the sequence. */
  public A086313() {
    super(0, new A086315().getCR().add(1).subtract(CR.LOG2.inverse().add(ALPHA.square()).subtract(ALPHA).divide(new A048651().getCR())));
  }
}

