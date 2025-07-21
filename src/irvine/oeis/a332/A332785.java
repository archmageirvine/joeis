package irvine.oeis.a332;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a013.A013929;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A332785 extends FilterSequence {

  /** Construct the sequence. */
  public A332785() {
    super(1, new A013929(), k -> !Predicates.POWERFUL.is(k));
  }
}
