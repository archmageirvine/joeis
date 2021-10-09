package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016645 Decimal expansion of log(22).
 * @author Sean A. Irvine
 */
public class A016645 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016645() {
    super(CR.valueOf(22).log());
  }
}
