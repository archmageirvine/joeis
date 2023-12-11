package irvine.oeis.a016;

import irvine.oeis.a002.A002162;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016730 Continued fraction for log(2).
 * @author Sean A. Irvine
 */
public class A016730 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016730() {
    super(new A002162());
  }
}
