package irvine.oeis.a081;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a080.A080997;

/**
 * A081028 Numbers k such that k-th term of A080997 is prime.
 * @author Sean A. Irvine
 */
public class A081028 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081028() {
    super(1, new A080997(), PRIME);
  }
}
