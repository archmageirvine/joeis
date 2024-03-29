package irvine.oeis.a289;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-22 19:20

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a006.A006512;
import irvine.oeis.a031.A031158;

/**
 * A289123 Numbers n such that (n-2,n) are twin primes, and (n,n+2) are twin lucky numbers.
 * @author Georg Fischer
 */
public class A289123 extends IntersectionSequence {

  /** Construct the sequence. */
  public A289123() {
    super(new A006512(), new A031158());
  }
}
