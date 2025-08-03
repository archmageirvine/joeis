package irvine.oeis.a386;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a055.A055932;

/**
 * A386527 Numbers k in A055932 such that both k-1 and k+1 are not squarefree.
 * @author Sean A. Irvine
 */
public class A386527 extends FilterSequence {

  /** Construct the sequence. */
  public A386527() {
    super(1, new A055932(), k -> !Predicates.SQUARE_FREE.is(k.subtract(1)) && !Predicates.SQUARE_FREE.is(k.add(1)));
  }
}

