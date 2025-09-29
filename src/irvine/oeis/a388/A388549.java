package irvine.oeis.a388;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a386.A386762;

/**
 * A388549 Perfect powers k^m, m &gt; 2, of nonsquarefree numbers k that are not squareful.
 * @author Sean A. Irvine
 */
public class A388549 extends FilterSequence {

  /** Construct the sequence. */
  public A388549() {
    super(1, new A386762(), Predicates.CUBEFUL::is);
  }
}
