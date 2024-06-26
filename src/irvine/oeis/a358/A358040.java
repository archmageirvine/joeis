package irvine.oeis.a358;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.oeis.a004.A004709;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A358040 a(n) is the number of divisors of the n-th cubefree number.
 * @author Georg Fischer
 */
public class A358040 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A358040() {
    super(1, new A004709(), v -> Functions.SIGMA0.z(v));
  }
}
