package irvine.oeis.a221;
// manually (decexp) at 2021-07-12

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A221208 Decimal expansion of the Borwein integral with 8 sinc functions.
 * @author Georg Fischer
 */
public class A221208 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A221208() {
    super(1, CR.valueOf(new Q(new Z("467807924713440738696537864469"), new Z("935615849440640907310521750000"))).multiply(CR.PI));
  }
}
