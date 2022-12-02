package irvine.oeis.a139;
// manually doubled

import irvine.oeis.DoubledSequence;

/**
 * A139554 a(n) = lcm(1..floor(n/4)).
 * @author Georg Fischer
 */
public class A139554 extends DoubledSequence {

  /** Construct the sequence. */
  public A139554() {
    super(0, new A139550());
  }
}
