package irvine.oeis.a234;
// Generated by gen_seq4.pl 2024-12-02.ack/insect2 at 2024-12-02 23:40

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000578;
import irvine.oeis.a024.A024675;

/**
 * A234240 Cubes which are arithmetic mean of two consecutive primes.
 * @author Georg Fischer
 */
public class A234240 extends IntersectionSequence {

  /** Construct the sequence. */
  public A234240() {
    super(new A000578(), new A024675());
  }
}
