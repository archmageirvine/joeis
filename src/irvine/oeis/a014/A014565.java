package irvine.oeis.a014;

import irvine.oeis.a005.A005614;
import irvine.oeis.cons.BinaryToDecimalExpansionSequence;

/**
 * A014565 Decimal expansion of rabbit constant.
 * @author Sean A. Irvine
 */
public class A014565 extends BinaryToDecimalExpansionSequence {

  /** Construct the sequence. */
  public A014565() {
    super(0, new A005614());
  }
}
