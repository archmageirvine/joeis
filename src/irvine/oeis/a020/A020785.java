package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020785 Decimal expansion of 1/sqrt(28).
 * @author Sean A. Irvine
 */
public class A020785 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020785() {
    super(CR.valueOf(28).sqrt().inverse());
  }
}
