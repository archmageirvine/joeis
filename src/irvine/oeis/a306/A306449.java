package irvine.oeis.a306;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-24 19:57

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a005.A005939;
import irvine.oeis.a013.A013929;

/**
 * A306449 Pseudoprimes to base 10 that are not squarefree.
 * @author Georg Fischer
 */
public class A306449 extends IntersectionSequence {

  /** Construct the sequence. */
  public A306449() {
    super(new A005939(), new A013929());
  }
}
