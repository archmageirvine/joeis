package irvine.oeis.a274;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-22 19:20

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a001.A001358;
import irvine.oeis.a071.A071148;

/**
 * A274182 Semiprimes that are the sum of the first n odd primes for some n.
 * @author Georg Fischer
 */
public class A274182 extends IntersectionSequence {

  /** Construct the sequence. */
  public A274182() {
    super(new A001358(), new A071148());
  }
}
