package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004597 Expansion of e in base 6.
 * @author Sean A. Irvine
 */
public class A004597 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004597() {
    super(0, CR.E, 6);
  }
}
