package irvine.oeis.a393;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a134.A134970;

/**
 * A393015 allocated for Alexander Yutkin.
 * @author Sean A. Irvine
 */
public class A393015 extends FilterSequence {

  /** Construct the sequence. */
  public A393015() {
    super(new A134970(), Predicates.PALINDROME::is);
  }
}

