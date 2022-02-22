package irvine.oeis.a077;
// manually insect/insect2 at 2022-02-22 19:20

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a033.A033045;

/**
 * A077722 Primes which can be expressed as sums of distinct powers of 8.
 * @author Georg Fischer
 */
public class A077722 extends IntersectionSequence {

  /** Construct the sequence. */
  public A077722() {
    super(new A000040(), new A033045());
  }
}
