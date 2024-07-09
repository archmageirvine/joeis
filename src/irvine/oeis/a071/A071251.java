package irvine.oeis.a071;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A071251 Squarefree palindromes.
 * @author Sean A. Irvine
 */
public class A071251 extends FilterSequence {

  /** Construct the sequence. */
  public A071251() {
    super(new A002113().skip(), Predicates.SQUARE_FREE::is);
  }
}
