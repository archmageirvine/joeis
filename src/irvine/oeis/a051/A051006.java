package irvine.oeis.a051;

import irvine.oeis.a010.A010051;
import irvine.oeis.cons.BinaryToDecimalExpansionSequence;

/**
 * A051006 Prime constant: decimal value of (A010051 interpreted as a binary number).
 * @author Sean A. Irvine
 */
public class A051006 extends BinaryToDecimalExpansionSequence {

  /** Construct the sequence. */
  public A051006() {
    super(0, new A010051());
  }
}
