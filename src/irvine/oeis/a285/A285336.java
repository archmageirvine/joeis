package irvine.oeis.a285;
// Generated by gen_seq4.pl 2024-04-17/multraf at 2024-04-17 19:29

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a065.A065642;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A285336 a(n) = numerator of A065642(n)/n.
 * @author Georg Fischer
 */
public class A285336 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A285336() {
    super(1, (self, n) -> new Q(self.s(0), Z.valueOf(n)).num(), "", new A065642());
  }
}
