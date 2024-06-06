package irvine.oeis.a030;

import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A030797 Decimal expansion of the constant x such that x^x = e. Inverse of W(1), where W is Lambert's function.
 * @author Sean A. Irvine
 */
public class A030797 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A030797() {
    super(new A030178().getCR().inverse());
  }
}
