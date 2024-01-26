package irvine.oeis.a068;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000010;

/**
 * A068080 Integers n such that n + phi(n) is a prime.
 * @author Sean A. Irvine
 */
public class A068080 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A068080() {
    super(1, 1, new A000010(), (n, k) -> k.add(n).isProbablePrime());
  }
}
