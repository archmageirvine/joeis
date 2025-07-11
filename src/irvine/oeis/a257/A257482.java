package irvine.oeis.a257;
// Generated by gen_seq4.pl 2025-05-26.ack/filnum at 2025-05-26 23:11

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A257482 Numbers m such that prime(m) mod 8 == prime(m) mod 27.
 * @author Georg Fischer
 */
public class A257482 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A257482() {
    super(1, 1, k -> Functions.PRIME.z(k).mod(8) == Functions.PRIME.z(k).mod(27));
  }
}
