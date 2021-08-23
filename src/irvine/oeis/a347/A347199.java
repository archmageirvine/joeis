package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A347199.
 * @author Sean A. Irvine
 */
public class A347199 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347199() {
    super(CR.ONE.sin().multiply(CR.ONE.sinh()));
  }
}

