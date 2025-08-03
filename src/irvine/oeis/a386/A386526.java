package irvine.oeis.a386;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a025.A025487;

/**
 * A386526 Products m of primorials (i.e., m in A025487) such that both m-1 and m+1 are not squarefree.
 * @author Sean A. Irvine
 */
public class A386526 extends FilterSequence {

  /** Construct the sequence. */
  public A386526() {
    super(1, new A025487(), k -> !Predicates.SQUARE_FREE.is(k.subtract(1)) && !Predicates.SQUARE_FREE.is(k.add(1)));
  }
}

