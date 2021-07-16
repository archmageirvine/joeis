package irvine.oeis.a210;
// manually (decexp) at 2021-07-16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A210965 Decimal expansion of k such that e^(Pi*k) = round(e^(Pi*sqrt(163))).
 * Formula: log(262537412640768744)/Pi
 * @author Georg Fischer
 */
public class A210965 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A210965() {
    super(2, CR.valueOf(new Z("262537412640768744")).log().divide(CR.PI));
  }
}
