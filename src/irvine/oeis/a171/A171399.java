package irvine.oeis.a171;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.oeis.a045.A045345;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A171399 Prime(k), where k is such that (Sum_{i=1..k} prime(i)) / k is an integer.
 * @author Georg Fischer
 */
public class A171399 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A171399() {
    super(1, new A045345(), v -> Functions.PRIME.z(v));
  }
}
