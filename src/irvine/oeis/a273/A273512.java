package irvine.oeis.a273;
// manually (decexp) at 2021-07-27

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A273512 Expansion of Lemniscate constant or Gauss's constant in base 2.
 * Formula: Pi^(3/2)/Gamma[3/4]^2*Sqrt[2]/2
 * @author Georg Fischer
 */
public class A273512 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A273512() {
    super(2, CR.PI.pow(CR.valueOf(1.5)).divide(CR.valueOf(0.75).gamma().pow(CR.TWO)).multiply(CR.SQRT2).divide(CR.TWO), 2);
  }
}
