package irvine.oeis.a068;

import irvine.oeis.a021.A021002;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A068982 Decimal expansion of the limit of the product of a modified Zeta function.
 * @author Sean A. Irvine
 */
public class A068982 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068982() {
    super(0, new A021002().getCR().inverse());
  }
}
