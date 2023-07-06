package irvine.oeis.a050;

import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a034.A034706;

/**
 * A050943 The sum of 2 or more consecutive nonzero triangular numbers.
 * @author Sean A. Irvine
 */
public class A050943 extends A034706 {

  /** Construct the sequence. */
  public A050943() {
    super(2, MemorySequence.cachedSequence(new A000217().skip(1)));
  }
}

