package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-06-16/lambdan at 2024-06-16 23:57

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A373137 a(n) = 1 if A276085(n) is a multiple of 8, otherwise 0, where A276085 is the primorial base log-function.
 * @author Georg Fischer
 */
public class A373137 extends LambdaSequence {

  /** Construct the sequence. */
  public A373137() {
    super(1, n -> Functions.PRIMORIAL_BASE_LOG.z(n).mod(8) == 0 ? Z.ONE : Z.ZERO);
  }
}
