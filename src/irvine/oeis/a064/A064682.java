package irvine.oeis.a064;

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a000.A000312;

/**
 * A064682 a(n) = number of partitions of n^n into distinct parts.
 * @author Georg Fischer
 */
public class A064682 extends NestedSequence {

  /** Construct the sequence. */
  public A064682() {
    super(0, new A000009(), new A000312(), 0, 0);
  }

}
