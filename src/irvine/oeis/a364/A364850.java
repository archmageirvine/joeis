package irvine.oeis.a364;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a014.A014963;
import irvine.oeis.a023.A023900;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A364850 a(n) = negated numerator of A014963(n)*A023900(n)/2.
 * @author Georg Fischer
 */
public class A364850 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A364850() {
    super(1, (n, s) -> new Q(s[0].multiply(s[1]), Z.TWO).num().negate(), "", new A014963(), new A023900());
  }
}
