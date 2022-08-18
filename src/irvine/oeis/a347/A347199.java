package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A347199 Decimal expansion of sin(1) * sinh(1).
 * @author Sean A. Irvine
 */
public class A347199 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347199() {
    super(0, CR.ONE.sin().multiply(CR.ONE.sinh()));
  }
}

