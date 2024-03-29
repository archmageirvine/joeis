package irvine.oeis.a092;
// Generated by gen_seq4.pl manch4/insect2 at 2024-03-12 13:36

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a085.A085724;

/**
 * A092558 Numbers k such that 2^k +- 1 are both semiprimes.
 * @author Georg Fischer
 */
public class A092558 extends IntersectionSequence {

  /** Construct the sequence. */
  public A092558() {
    super(new A092559(), new A085724());
  }
}
