package irvine.oeis.a064;

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a000.A000142;

/**
 * A064681 a(n) = number of partitions of n! into distinct parts.
 * @author Georg Fischer
 */
public class A064681 extends NestedSequence {

  /** Construct the sequence. */
  public A064681() {
    super(0, new A000009(), new A000142(), 0, 0);
  }

}
