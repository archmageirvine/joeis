package irvine.oeis.a104;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-24 19:57

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000040;

/**
 * A104364 Primes of the form A104350(k) - 1.
 * @author Georg Fischer
 */
public class A104364 extends IntersectionSequence {

  /** Construct the sequence. */
  public A104364() {
    super(new A104357(), new A000040());
  }
}
