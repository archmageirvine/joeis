package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016683 Decimal expansion of log(60).
 * @author Sean A. Irvine
 */
public class A016683 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016683() {
    super(CR.valueOf(60).log());
  }
}
