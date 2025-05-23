package irvine.oeis.a253;
// Generated by gen_seq4.pl 2025-02-03.ack/lambdan at 2025-02-03 18:14

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a071.A071961;

/**
 * A253179 a(n) = mu(n)*Sum_{k=1..n} (n/k) where mu(n) is M\u00f6bius (or Moebius) function and (x/y) is Kronecker's symbol.
 * @author Georg Fischer
 */
public class A253179 extends LambdaSequence {

  private static final DirectSequence A071961 = new A071961();

  /** Construct the sequence. */
  public A253179() {
    super(1, n -> (n <= 1) ? Z.ONE : Functions.MOBIUS.z(n).multiply(A071961.a(n)));
  }
}
