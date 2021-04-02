package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.ContinuedFractionDenominatorSequence;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A046104 Denominators of convergents to the diesis log_2(5/4).
 * @author Sean A. Irvine
 */
public class A046104 extends ContinuedFractionDenominatorSequence {

  private static final CR N = CR.valueOf(new Q(5, 4)).log().divide(CR.TWO.log());

  /** Construct the sequence. */
  public A046104() {
    super(new DecimalExpansionSequence() {
      @Override
      protected CR getCR() {
        return N;
      }
    });
  }
}

