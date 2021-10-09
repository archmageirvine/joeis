package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016722 Decimal expansion of log(99).
 * @author Sean A. Irvine
 */
public class A016722 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016722() {
    super(CR.valueOf(99).log());
  }
}
