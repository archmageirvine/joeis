package irvine.oeis.a333;
// Generated by gen_seq4.pl 2025-05-02.ack/filnum at 2025-05-02 12:03

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A333741 Odd numbers k such that phi(k) = phi(k+2), where phi is the Euler totient function (A000010).
 * @author Georg Fischer
 */
public class A333741 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A333741() {
    super(1, 0, k -> (k & 1) == 1 && Functions.PHI.z(k).equals(Functions.PHI.z(k + 2)));
  }
}
