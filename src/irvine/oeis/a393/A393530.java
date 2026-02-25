package irvine.oeis.a393;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a157.A157711;

/**
 * A393530 allocated for Hans Havermann.
 * @author Sean A. Irvine
 */
public class A393530 extends FilterSequence {

  /** Construct the sequence. */
  public A393530() {
    super(1, new A157711(), k -> Predicates.EMIRP.is(k));
  }
}

