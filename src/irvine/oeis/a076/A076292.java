package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001597;

/**
 * A076292 Perfect powers with squarefree root.
 * @author Sean A. Irvine
 */
public class A076292 extends FilterSequence {

  /** Construct the sequence. */
  public A076292() {
    super(1, new A001597(), k -> Z.ONE.equals(k) || Predicates.SQUARE_FREE.is(k.isPower()));
  }
}
