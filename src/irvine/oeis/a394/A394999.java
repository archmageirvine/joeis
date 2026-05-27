package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A394999 allocated for Rudra Jadhav.
 * @author Sean A. Irvine
 */
public class A394999 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A394999() {
    super(0, CR.PHI.multiply(CR.GAMMA));
  }
}
