package irvine.oeis.a014;

import irvine.oeis.BinaryToDecimalExpansionSequence;
import irvine.oeis.a005.A005614;

/**
 * A014565 Decimal expansion of rabbit constant.
 * @author Sean A. Irvine
 */
public class A014565 extends BinaryToDecimalExpansionSequence {

  /** Construct the sequence. */
  public A014565() {
    super(new A005614());
  }
}
