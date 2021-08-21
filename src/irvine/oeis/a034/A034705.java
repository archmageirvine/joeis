package irvine.oeis.a034;

import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000290;

/**
 * A034705 Numbers that are sums of consecutive squares.
 * @author Sean A. Irvine
 */
public class A034705 extends A034706 {

  /** Construct the sequence. */
  public A034705() {
    super(1, MemorySequence.cachedSequence(new A000290()));
  }
}

