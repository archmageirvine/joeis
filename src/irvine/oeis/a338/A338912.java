package irvine.oeis.a338;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.oeis.a084.A084126;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A338912 Lesser prime index of the n-th semiprime.
 * @author Georg Fischer
 */
public class A338912 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A338912() {
    super(1, new A084126(), v -> Functions.PRIME_PI.z(v));
  }
}
