package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A347059 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A347059 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347059() {
    super(Zeta.zeta(9).multiply(255).divide(CR.valueOf(256)));
  }
}
