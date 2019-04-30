package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a002.A002162;

/**
 * A016730 Continued fraction for <code>log(2)</code>.
 * @author Sean A. Irvine
 */
public class A016730 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016730() {
    super(new A002162());
  }
}
