package irvine.oeis.a327;
// Generated by gen_seq4.pl 2024-09-22.ack/lambdan at 2024-09-22 22:36

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A327965 "Tamed variant" of arithmetic derivative: a(0) = a(1) = 0; for n &gt; 1, a(n) = A327938(A003415(n)).
 * @author Georg Fischer
 */
public class A327965 extends LambdaSequence {

  private static final DirectSequence A327938 = new A327938();

  /** Construct the sequence. */
  public A327965() {
    super(0, n -> (n <= 1) ? Z.ZERO : A327938.a(Functions.ARD.z(n)));
  }
}
