package irvine.oeis.a274;
// Generated by gen_seq4.pl robots/union2 at 2024-02-11 21:11

import irvine.oeis.UnionSequence;
import irvine.oeis.a037.A037082;
import irvine.oeis.a135.A135726;

/**
 * A274386 Triple factorial primes: primes which are within 1 of a triple factorial number.
 * @author Georg Fischer
 */
public class A274386 extends UnionSequence {

  /** Construct the sequence. */
  public A274386() {
    super(1, new A037082(), new A135726());
  }
}
