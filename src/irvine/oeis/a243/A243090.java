package irvine.oeis.a243;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-24 19:57

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a013.A013929;
import irvine.oeis.a020.A020137;

/**
 * A243090 Pseudoprimes to base 8 that are not squarefree.
 * @author Georg Fischer
 */
public class A243090 extends IntersectionSequence {

  /** Construct the sequence. */
  public A243090() {
    super(new A020137(), new A013929());
  }
}
