package irvine.oeis.a248;

import irvine.oeis.DoubledSequence;
import irvine.oeis.a010.A010050;

/**
 * A248812 Repeated terms of (2n)! (A010050).
 * @author Georg Fischer
 */
public class A248812 extends DoubledSequence {

  /** Construct the sequence. */
  public A248812() {
    super(0, new A010050());
  }
}
