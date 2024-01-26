package irvine.oeis.a068;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000010;

/**
 * A068081 Numbers n such that n + phi(n) and n - phi(n) are prime.
 * @author Sean A. Irvine
 */
public class A068081 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A068081() {
    super(1, 1, new A000010(), (n, k) -> k.add(n).isProbablePrime() && k.subtract(n).negate().isProbablePrime());
  }
}
