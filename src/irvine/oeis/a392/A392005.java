package irvine.oeis.a392;

import irvine.oeis.a176.A176015;
import irvine.oeis.a390.A390038;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392005 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A392005 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392005() {
    super(1, new A390038().getCR().divide(new A176015().getCR()));
  }
}
