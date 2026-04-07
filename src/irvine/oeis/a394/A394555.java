package irvine.oeis.a394;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a393.A393919;

/**
 * A394555 Powerful k such that rad(Sum({m &lt;= k : rad(m) = rad(k)})) = rad(k), where rad = A007947.
 * @author Sean A. Irvine
 */
public class A394555 extends FilterSequence {

  /** Construct the sequence. */
  public A394555() {
    super(1, new A393919(), Predicates.SQUAREFUL::is);
  }
}
