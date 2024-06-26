package irvine.oeis.a080;
// Generated by gen_seq4.pl 2024-06-01/lambdan at 2024-06-01 22:47

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A080305 Denominator of n^mu(n), where mu is the Moebius function (A008683).
 * @author Georg Fischer
 */
public class A080305 extends LambdaSequence {

  /** Construct the sequence. */
  public A080305() {
    super(1, n -> Functions.MOEBIUS.i(n) < 0 ? Z.valueOf(n) : Z.ONE);
  }
}
