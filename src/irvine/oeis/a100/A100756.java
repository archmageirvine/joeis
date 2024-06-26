package irvine.oeis.a100;
// Generated by gen_seq4.pl 2024-04-09/simtraf at 2024-04-09 23:00

import irvine.math.function.Functions;
import irvine.oeis.a003.A003590;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A100756 Greatest prime factor of the concatenation of terms in the n-th row of Pascal's Triangle.
 * @author Georg Fischer
 */
public class A100756 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A100756() {
    super(1, new A003590().skip(1), v -> Functions.GPF.z(v));
  }
}
