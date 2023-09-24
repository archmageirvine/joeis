package irvine.oeis.a260;
// manually diffs/diffseq at 2023-09-23 08:15

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a023.A023503;

/**
 * A260360 The absolute difference between the largest prime factors of prime(n)-1 and prime(n+1)-1.
 * @author Georg Fischer
 */
public class A260360 extends DifferenceSequence {

  /** Construct the sequence. */
  public A260360() {
    super(2, new A023503(), true);
  }
}
