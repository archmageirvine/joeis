package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011252 Decimal expansion of 13th root of 8.
 * @author Sean A. Irvine
 */
public class A011252 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011252() {
    super(ComputableReals.SINGLETON.pow(CR.EIGHT, CR.valueOf(13).inverse()));
  }
}
