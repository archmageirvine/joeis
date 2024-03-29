package irvine.oeis.a105;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-22 19:20

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a001.A001043;
import irvine.oeis.a014.A014612;

/**
 * A105936 Numbers that are the product of exactly 3 primes and are of the form prime(n) + prime(n+1).
 * @author Georg Fischer
 */
public class A105936 extends IntersectionSequence {

  /** Construct the sequence. */
  public A105936() {
    super(new A001043(), new A014612());
  }
}
