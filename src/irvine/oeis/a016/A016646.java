package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016646 Decimal expansion of log(23).
 * @author Sean A. Irvine
 */
public class A016646 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016646() {
    super(CR.valueOf(23).log());
  }
}
