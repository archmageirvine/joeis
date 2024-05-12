package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A066758 Triangular numbers not divisible by 10 whose reverse is pentagonal.
 * @author Sean A. Irvine
 */
public class A066758 extends FilterSequence {

  /** Construct the sequence. */
  public A066758() {
    super(1, new A000217(), k -> {
      return k.isZero() || (k.mod(10) != 0 && Predicates.POLYGONAL.is(5, Functions.REVERSE.z(k)));
    });
  }
}

