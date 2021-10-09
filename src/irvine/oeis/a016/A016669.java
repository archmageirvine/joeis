package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016669 Decimal expansion of log(46).
 * @author Sean A. Irvine
 */
public class A016669 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016669() {
    super(CR.valueOf(46).log());
  }
}
