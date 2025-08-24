package irvine.oeis.a386;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A386522 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A386522() {
    super(0, CR.PI.divide(10800));
  }
}

