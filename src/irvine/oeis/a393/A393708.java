package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a052.A052486;

/**
 * A393708 Achilles numbers with more than 2 distinct prime factors.
 * @author Sean A. Irvine
 */
public class A393708 extends FilterSequence {

  /** Construct the sequence. */
  public A393708() {
    super(1, new A052486(), k -> Functions.OMEGA.i(k) > 2);
  }
}

