package irvine.oeis.a371;
// manually 2026-08-08.ack/declamb at 2026-08-08 19:42

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A371498 Decimal expansion of Sum_{k&gt;=0} ((-1)^k)/(k^2)!.
 * @author Georg Fischer
 */
public class A371498 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A371498() {
    super(0, 0, k -> new Q(Z.NEG_ONE.pow(k), Functions.FACTORIAL.z(k * k)));
    next();
  }
}
