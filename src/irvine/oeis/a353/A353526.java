package irvine.oeis.a353;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.z.Z;
import irvine.oeis.a053.A053669;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A353526 The smallest prime not dividing n, reduced modulo 4.
 * @author Georg Fischer
 */
public class A353526 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A353526() {
    super(1, new A053669(), v -> v.mod(Z.FOUR));
  }
}
