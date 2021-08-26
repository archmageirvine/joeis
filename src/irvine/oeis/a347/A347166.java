package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A347166 Decimal expansion of (gamma + log(2)) * Pi / 2.
 * @author Sean A. Irvine
 */
public class A347166 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347166() {
    super(CR.GAMMA.add(CR.TWO.log()).multiply(CR.HALF_PI));
  }
}

