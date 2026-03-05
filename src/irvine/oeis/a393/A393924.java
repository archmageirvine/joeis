package irvine.oeis.a393;

import irvine.oeis.UnionSequence;
import irvine.oeis.a001.A001694;
import irvine.oeis.a005.A005117;

/**
 * A393924 Numbers that are either squarefree or squareful.
 * @author Sean A. Irvine
 */
public class A393924 extends UnionSequence {

  /** Construct the sequence. */
  public A393924() {
    super(1, new A001694(), new A005117());
  }
}
