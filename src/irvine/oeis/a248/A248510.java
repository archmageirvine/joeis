package irvine.oeis.a248;
// manually decexp at 2021-08-11 22:14

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A248510 Decimal expansion of von Klitzing constant R(K) (ohms).
 * Formula: 5521725125000000000000/213914163877964163
 * @author Georg Fischer
 */
public class A248510 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A248510() {
    super(5, CR.valueOf(new Z("5521725125000000000000")).divide(CR.valueOf(new Z("213914163877964163"))));
  }
}
