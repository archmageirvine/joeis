package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387793 allocated for Mats Granvik.
 * @author Sean A. Irvine
 */
public class A388201 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388201() {
    super(1, CR.valueOf(293).sqrt().multiply(17).add(235).divide(398));
  }
}

