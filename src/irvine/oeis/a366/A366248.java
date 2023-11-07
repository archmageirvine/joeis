package irvine.oeis.a366;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A366248 allocated for Jack Zhang.
 * @author Sean A. Irvine
 */
public class A366248 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A366248() {
    super(2, CR.valueOf(666).sqrt());
  }
}

