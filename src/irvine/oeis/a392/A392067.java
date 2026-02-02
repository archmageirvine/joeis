package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392067 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A392067 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392067() {
    super(1, CR.PHI.log10().multiply(2).inverse());
  }
}

