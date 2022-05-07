package irvine.oeis.a064;

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a003.A003422;

/**
 * A064300 Number of partitions of !n into distinct parts.
 * @author Georg Fischer
 */
public class A064300 extends NestedSequence {

  /** Construct the sequence. */
  public A064300() {
    super(0, new A000009(), new A003422(), 0, 0);
  }

}
