package irvine.oeis.a329;
// Generated by gen_seq4.pl known/simtraf at 2023-11-06 12:44

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A329614 Smallest prime factor of the number of divisors of A108951(n).
 * @author Georg Fischer
 */
public class A329614 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A329614() {
    super(1, new A329605(), v -> Functions.LPF.z(v));
  }
}
