package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A079840.
 * @author Sean A. Irvine
 */
public class A387300 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387300() {
    super(0, CR.valueOf(15).sqrt().divide(CR.PI).log());
  }
}

