package irvine.oeis.a333;
// Generated by gen_seq4.pl 2025-05-02.ack/filnum at 2025-05-02 12:03

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A333040 Even numbers m such that sigma(m) &lt; sigma(m-1).
 * @author Georg Fischer
 */
public class A333040 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A333040() {
    super(1, 0, m -> (m & 1) == 0 && Functions.SIGMA1.z(m).compareTo(Functions.SIGMA1.z(m - 1)) < 0);
  }
}
