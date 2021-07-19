package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.ContinuedFractionNumeratorSequence;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A046103 Numerators of convergents to the diesis, log_2(5/4).
 * @author Sean A. Irvine
 */
public class A046103 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A046103() {
    super(new DecimalExpansionSequence(CR.valueOf(new Q(5, 4)).log().divide(CR.TWO.log())));
  }
}

