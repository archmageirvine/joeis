package irvine.oeis.a173;
// Generated by gen_seq4.pl 2024-03-14g/simtraf at 2024-03-14 21:15

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A173508 a(n) = ceiling(A173497(n)/2).
 * @author Georg Fischer
 */
public class A173508 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A173508() {
    super(0, new A173497(), v -> new Q(v, Z.TWO).ceiling());
  }
}
