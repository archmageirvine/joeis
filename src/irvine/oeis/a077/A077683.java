package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a217.A217400;

/**
 * A077683 Squarefree numbers beginning with 7.
 * @author Sean A. Irvine
 */
public class A077683 extends FilterSequence {

  /** Construct the sequence. */
  public A077683() {
    super(1, new A217400(), Predicates.SQUARE_FREE::is);
  }
}
