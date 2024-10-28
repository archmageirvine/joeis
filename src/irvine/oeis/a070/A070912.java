package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A070912 Binary expansion of BesselI(0,2).
 * @author Georg Fischer
 */
public class A070912 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A070912() {
    super(2, CrFunctions.BESSEL_I0.cr(CR.TWO), 2);
  }
}
