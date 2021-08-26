package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A347201 Decimal expansion of sin(sqrt(2)).
 * @author Sean A. Irvine
 */
public class A347201 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347201() {
    super(CR.SQRT2.sin());
  }
}

