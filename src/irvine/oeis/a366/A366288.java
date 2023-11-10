package irvine.oeis.a366;
// manually robots/union2 at 2023-11-09 11:57

import irvine.oeis.UnionSequence;
import irvine.oeis.a008.A008585;
import irvine.oeis.a013.A013929;

/**
 * A366288 Numbers k such that 3*k is not squarefree.
 * @author Georg Fischer
 */
public class A366288 extends UnionSequence {

  /** Construct the sequence. */
  public A366288() {
    super(1, new A013929(), new A008585().skip(1));
  }
}
