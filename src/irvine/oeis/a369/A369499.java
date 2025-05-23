package irvine.oeis.a369;
// Generated by gen_seq4.pl 2024-12-01.ack/decexp at 2024-12-01 23:03

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A369499 Decimal expansion of exp(sqrt(3)*Pi/18)/3^(1/4).
 * Formula: exp(sqrt(3)*Pi/18)/3^(1/4)
 * @author Georg Fischer
 */
public class A369499 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A369499() {
    super(1, CR.THREE.sqrt().multiply(CR.PI).divide(18).exp().divide(CR.THREE.pow(new Q(1, 4))));
  }
}
