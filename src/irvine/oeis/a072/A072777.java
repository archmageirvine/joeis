package irvine.oeis.a072;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;

/**
 * A072777 Powers of squarefree numbers that are not squarefree.
 * @author Sean A. Irvine
 */
public class A072777 extends FilterSequence {

  /** Construct the sequence. */
  public A072777() {
    super(1, new A072774(), Predicates.POWER::is);
  }
}
