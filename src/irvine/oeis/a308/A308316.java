package irvine.oeis.a308;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-24 19:57

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000043;
import irvine.oeis.a002.A002384;

/**
 * A308316 Numbers m such that q = 2^m - 1 and r = m^2 + m + 1 are both primes.
 * @author Georg Fischer
 */
public class A308316 extends IntersectionSequence {

  /** Construct the sequence. */
  public A308316() {
    super(new A000043(), new A002384());
  }
}
