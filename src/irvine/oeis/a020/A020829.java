package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020829 Decimal expansion of 1/sqrt(72) = 1/(3*2^(3/2)) = sqrt(2)/12.
 * @author Sean A. Irvine
 */
public class A020829 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020829() {
    super(CR.valueOf(72).sqrt().inverse());
  }
}
