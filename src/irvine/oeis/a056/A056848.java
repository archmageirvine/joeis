package irvine.oeis.a056;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000009;

/**
 * A056848 Numbers k that divide the number of partitions of k into distinct parts (A000009).
 * @author Sean A. Irvine
 */
public class A056848 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A056848() {
    super(1, 1, new A000009().skip(), (n, k) -> k.mod(n) == 0);
  }
}
