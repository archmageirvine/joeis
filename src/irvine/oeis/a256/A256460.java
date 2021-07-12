package irvine.oeis.a256;
// manually (decexp) at 2021-07-12

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A256460 Decimal expansion of 1/273.16, the fraction of the triple point temperature of water corresponding to 1 K (kelvin).
 * @author Georg Fischer
 */
public class A256460 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A256460() {
    super(-2, CR.valueOf(new Q(100, 27316)));
  }
}
