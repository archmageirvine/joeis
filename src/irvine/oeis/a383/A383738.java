package irvine.oeis.a383;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000170;
import irvine.oeis.a033.A033148;

/**
 * A383738 Number of solutions to the n-queens puzzle in a n X n board that are not square root permutations of {n-1,...,2,1,0}.
 * @author Sean A. Irvine
 */
public class A383738 extends Combiner {

  /** Construct the sequence. */
  public A383738() {
    super(1, new A000170().skip(), new A033148(), SUBTRACT);
  }
}

