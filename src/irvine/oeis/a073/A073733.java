package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.PrependSequence;
import irvine.oeis.cons.ContinuedFractionNumeratorSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073733 Numerators of convergents to log_2(10).
 * @author Sean A. Irvine
 */
public class A073733 extends PrependSequence {

  /** Construct the sequence. */
  public A073733() {
    super(0, new ContinuedFractionNumeratorSequence(new DecimalExpansionSequence(CR.LOG10.divide(CR.TWO.log()))), 1);
  }
}

