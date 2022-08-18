package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004564 Expansion of sqrt(6) in base 5.
 * @author Sean A. Irvine
 */
public class A004564 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004564() {
    super(1, CR.SIX.sqrt(), 5);
  }
}
