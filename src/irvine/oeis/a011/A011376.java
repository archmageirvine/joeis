package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011376 Decimal expansion of 17th root of 16.
 * @author Sean A. Irvine
 */
public class A011376 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011376() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(16), CR.valueOf(17).inverse()));
  }
}
