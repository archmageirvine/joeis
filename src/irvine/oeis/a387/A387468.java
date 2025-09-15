package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387468 Decimal expansion of 3*Pi/(8*sqrt(2)).
 * @author Sean A. Irvine
 */
public class A387468 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387468() {
    super(0, CR.PI.multiply(3).divide(CR.valueOf(128).sqrt()));
  }
}
