package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016678 Decimal expansion of log(55).
 * @author Sean A. Irvine
 */
public class A016678 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016678() {
    super(CR.valueOf(55).log());
  }
}
