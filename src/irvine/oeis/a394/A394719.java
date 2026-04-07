package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A394719 Numbers k such that |s(k) - 2*k|, where s(k) is the aliquot sum A001065(k), is a perfect number.
 * @author Sean A. Irvine
 */
public class A394719 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A394719() {
    super(1, k -> Predicates.PERFECT.is(Functions.ALIQUOT.z(k).subtract(2 * k).abs()));
  }
}
