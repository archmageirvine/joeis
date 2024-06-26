package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A068071 Triangular numbers that remain triangular when the least significant digit is moved to the beginning.
 * @author Sean A. Irvine
 */
public class A068071 extends FilterSequence {

  /** Construct the sequence. */
  public A068071() {
    super(1, new A000217().skip(), k -> Predicates.TRIANGULAR.is(Functions.ROTATE_RIGHT.z(k)));
  }
}

