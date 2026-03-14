package irvine.oeis.a084;

import irvine.oeis.FilterPositionSequence;

/**
 * A084141 a(n) is the index in sequence A084138 when the value of that sequence is one (1), i.e., there is exactly one case where there are exactly a(n) primes between m and 2m, exclusively, for m &gt; 0.
 * @author Sean A. Irvine
 */
public class A084141 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A084141() {
    super(1, 0, new A084138(), ONE);
  }
}

