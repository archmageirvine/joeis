package irvine.oeis.a386;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A386522 Decimal expansion of the number of radians in a minute of arc.
 * @author Sean A. Irvine
 */
public class A386522 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A386522() {
    super(0, CR.PI.divide(10800));
  }
}

