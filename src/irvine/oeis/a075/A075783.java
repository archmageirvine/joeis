package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001597;

/**
 * A075767.
 * @author Sean A. Irvine
 */
public class A075783 extends FilterSequence {

  /** Construct the sequence. */
  public A075783() {
    super(new A001597(), k -> {
      final long s = Functions.DIGIT_SUM.l(k);
      return s == 1 || Predicates.POWER.is(s);
    });
  }
}
