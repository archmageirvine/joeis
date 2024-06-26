package irvine.oeis.a363;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.oeis.a036.A036966;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A363013 a(n) is the number of prime factors (counted with multiplicity) of the n-th cubefull number (A036966).
 * @author Georg Fischer
 */
public class A363013 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A363013() {
    super(1, new A036966(), v -> Functions.BIG_OMEGA.z(v));
  }
}
