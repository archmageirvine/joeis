package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000070;

/**
 * A014153 Expansion of 1/((1-x)^2*Product_{k&gt;=1} (1-x^k)).
 * @author Sean A. Irvine
 */
public class A014153 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014153() {
    super(new A000070());
  }
}
