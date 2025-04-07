package irvine.oeis.a382;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016627.
 * @author Sean A. Irvine
 */
public class A382854 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A382854() {
    super(0, CR.ONE.subtract(CR.LOG2).divide(2));
  }
}
