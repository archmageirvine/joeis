package irvine.oeis.a083;
// Generated by gen_seq4.pl 2025-04-22.ack/filnum at 2025-04-22 22:21

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A083794 Numbers k such that tau(k) is different from tau(k-1), where tau(m) = number of divisors of m.
 * @author Georg Fischer
 */
public class A083794 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A083794() {
    super(1, 1, k -> k == 1 || !Functions.TAU.z(k).equals(Functions.TAU.z(k - 1)));
  }
}
