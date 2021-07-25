package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346570 Decimal expansion of 2 - 33367 * Pi^7 / 100776960.
 * @author Sean A. Irvine
 */
public class A346570 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346570() {
    super(CR.TWO.subtract(CR.PI.pow(7).multiply(33367).divide(CR.valueOf(100776960))));
  }
}

