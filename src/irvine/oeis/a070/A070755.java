package irvine.oeis.a070;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000292;

/**
 * A070655.
 * @author Sean A. Irvine
 */
public class A070755 extends FilterSequence {

  /** Construct the sequence. */
  public A070755() {
    super(1, new A000292().skip(), Predicates.SQUARE_FREE::is);
  }
}
