package irvine.oeis.a352;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A352672 Decimal expansion of r = (3/2)*(1+sqrt(3)).
 * @author Georg Fischer
 */
public class A352672 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A352672() {
    super(1, CR.ONE.add(CR.THREE.sqrt()).multiply(new Q(3, 2)));
  }
}
