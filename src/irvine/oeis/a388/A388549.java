package irvine.oeis.a388;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a386.A386762;

/**
 * A013929.
 * @author Sean A. Irvine
 */
public class A388549 extends FilterSequence {

  /** Construct the sequence. */
  public A388549() {
    super(1, new A386762(), Predicates.CUBEFUL::is);
  }
}
