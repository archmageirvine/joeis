package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016719 Decimal expansion of log(96).
 * @author Sean A. Irvine
 */
public class A016719 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016719() {
    super(CR.valueOf(96).log());
  }
}
