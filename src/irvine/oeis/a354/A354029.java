package irvine.oeis.a354;
// Generated by gen_seq4.pl 2025-05-29.ack/lambdan at 2025-05-29 22:38

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a105.A105824;

/**
 * A354029 a(n) = 1 if either n or n/2 is a prime power of the form 4m+3, otherwise 0.
 * @author Georg Fischer
 */
public class A354029 extends LambdaSequence {

  private static final DirectSequence A105824 = new A105824();

  /** Construct the sequence. */
  public A354029() {
    super(1, n -> Z.valueOf(A105824.a(n).isZero() ? 1 : 0).multiply(Z.valueOf(Functions.PHI.z(n).mod(4) == 2 ? 1 : 0)));
  }
}
