package irvine.oeis.a046;

import irvine.oeis.a001.A001620;
import irvine.oeis.cons.ContinuedFractionNumeratorSequence;

/**
 * A046114 Numerators of convergents to Euler-Mascheroni constant.
 * @author Sean A. Irvine
 */
public class A046114 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A046114() {
    super(new A001620());
  }
}

