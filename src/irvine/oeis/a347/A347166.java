package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346451 Decimal expansion of 23 * Pi^4 / (1296 * sqrt(3)).
 * @author Sean A. Irvine
 */
public class A347166 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347166() {
    super(CR.GAMMA.add(CR.TWO.log()).multiply(CR.HALF_PI));
  }
}

